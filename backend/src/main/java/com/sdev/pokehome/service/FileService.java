package com.sdev.pokehome.service;

import com.sdev.pokehome.dto.PokeSav;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.MediaType;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.google.gson.Gson;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class FileService {
    private final String UPLOAD_DIR;
    private final Gson gson;
    private final WebClient webClient;

    public FileService(WebClient webClient, Gson gson, WebClient webClient1) {
        this.gson = gson;
        this.webClient = webClient1;
        this.UPLOAD_DIR = "uploads/";
    }

    public HashMap<String, String> saveFile(MultipartFile file){
        HashMap<String, String> response = new HashMap<>();

        try {

            if (file.isEmpty()) {
                throw new Exception("o argumento passado não é um arquivo valido");
            }

            // Criar um diretorio
            Files.createDirectories(Paths.get(this.UPLOAD_DIR));

            // Criar um nome unico
            String fileName = UUID.randomUUID() + "_" + file.getOriginalFilename();
            Path filePath = Paths.get(this.UPLOAD_DIR, fileName);

            // salvar o arquivo
            Files.write(filePath, file.getBytes());

            response.put("status", "success");
            response.put("error", null);
            response.put("content", fileName);
            return response;

        } catch (Exception e) {
            response.put("status", "error");
            response.put("error", e.getMessage());
            response.put("content", null);
            return response;
        }
    }

    public HashMap<String, String> convertToJson(String fileName) throws IOException, InterruptedException {
        HashMap<String, String> response = new HashMap<>();
        try{
            if (fileName.contains("..") || fileName.contains("/")) {
                throw new Exception("Nome de arquivo inválido");
            }

            Path filePath = Paths.get(this.UPLOAD_DIR, fileName);
            if (!Files.exists(filePath)) {
                throw new Exception("Arquivo não encontrado: " + fileName);
            }

            byte[] fileContent = Files.readAllBytes(filePath);
            String originalFileName = fileName.substring(fileName.indexOf("_") + 1);
            ByteArrayResource resource = new ByteArrayResource(fileContent) {
                @Override
                public String getFilename() {
                    return originalFileName;
                }
            };

            // Enviar para a API externa e esperar resposta como String
            Mono<String> apiResponseMono = webClient.post()
                    .uri("http://localhost:5148/api/save/upload")
                    .contentType(MediaType.MULTIPART_FORM_DATA)
                    .body(BodyInserters.fromMultipartData("file", resource))
                    .retrieve()
                    .bodyToMono(String.class) // Alterado de Map para String
                    .onErrorResume(e -> Mono.just("Erro ao enviar para API: " + e.getMessage()));

            // Bloquear para obter a resposta
            String apiResponse = apiResponseMono.block();

            response.put("status", "success");
            response.put("error", null);
            response.put("content", apiResponse);
            return response;
            //return gson.fromJson(json, PokeSav.class);
        } catch (Exception e) {
            response.put("status", "error");
            response.put("error", e.getMessage());
            response.put("content", null);
            return response;
        }
    }
}
