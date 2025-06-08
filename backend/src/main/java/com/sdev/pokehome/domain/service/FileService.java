package com.sdev.pokehome.domain.service;

import com.sdev.pokehome.domain.dto.PokeSav;
import com.sdev.pokehome.utilities.Response;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import com.google.gson.Gson;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class FileService {
    private static final String UPLOAD_ROOT = "uploads";
    private static final String SAV_DIR = UPLOAD_ROOT + "/sav";
    private static final String JSON_DIR = UPLOAD_ROOT + "/json";

    private final WebClient webClient;
    private final Gson gson;

    public FileService(WebClient webClient, Gson gson) {
        this.gson = gson;
        this.webClient = webClient;

        createDirectories(Path.of(SAV_DIR), Path.of(JSON_DIR));
    }

    public Response<String> saveFile(MultipartFile file){
        try {
            if (file.isEmpty()) {
                throw new Exception("o argumento passado não é um arquivo valido");
            }

            String uuid = UUID.randomUUID().toString();
            Path filePath = Paths.get(SAV_DIR, uuid + "_" + file.getOriginalFilename());
            Files.write(filePath, file.getBytes());

            Response<String> convertResponse = this.convertSav(file);
            if(convertResponse.status().equals("error")){
                throw new IOException(convertResponse.error());
            }

            String jsonFileName = uuid + "_sav.json";
            Path jsonFilePath = Paths.get(JSON_DIR, jsonFileName);
            Files.writeString(jsonFilePath, convertResponse.content());

            return Response.success(jsonFileName);

        } catch (Exception e) {
            return Response.error(e.getMessage());
        }
    }

    public Response<String> jsonToObject(String jsonFileName){
        try{
            if (jsonFileName == null || jsonFileName.contains("..") || jsonFileName.contains("/")) {
                throw new IllegalArgumentException("Nome de arquivo inválido");
            }

            Path jsonFilePath = Paths.get(JSON_DIR, jsonFileName);
            if (!Files.exists(jsonFilePath)) {
                throw new IOException("Arquivo não encontrado: " + jsonFileName);
            }

            String jsonContent = Files.readString(jsonFilePath);
            PokeSav pokeSav;
            try {
                pokeSav = gson.fromJson(jsonContent, PokeSav.class);
            } catch (Exception e) {
                throw new IOException("Erro ao desserializar JSON: " + e.getMessage());
            }

            return Response.success(pokeSav.getOT());
        } catch (IOException e) {
            return Response.error(e.getMessage());
        }
    }

    // ------------- Métodos Auxiliares -------------

    private void createDirectories(Path... paths) {
        for (Path p : paths) {
            try {
                Files.createDirectories(p);
            } catch (IOException ignored) {
                System.out.println("não foi possivel criar o diretorio" + JSON_DIR);
            }
        }
    }

    private Response<String> convertSav(MultipartFile file) throws IOException {
        try {
            byte[] bytes = file.getBytes();
            ByteArrayResource resource = new ByteArrayResource(bytes) {
                @Override
                public String getFilename() {
                    return file.getOriginalFilename();
                }
            };

            Mono<String> responseMono = webClient.post()
                    .uri("http://localhost:5148/api/save/upload")
                    .contentType(MediaType.MULTIPART_FORM_DATA)
                    .body(BodyInserters.fromMultipartData("file", resource))
                    .retrieve()
                    .bodyToMono(String.class);

            return Response.success(responseMono.block());
        } catch (Exception e) {
            return Response.error(e.getMessage());
        }
    }
}
