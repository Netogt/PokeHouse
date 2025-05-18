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
    private final String UPLOAD_DIR_SAV;
    private final String UPLOAD_DIR_JSON;
    private final Gson gson;
    private final WebClient webClient;

    public FileService(WebClient webClient, Gson gson, WebClient webClient1) {
        this.gson = gson;
        this.webClient = webClient1;
        this.UPLOAD_DIR = "uploads/";
        this.UPLOAD_DIR_SAV = this.UPLOAD_DIR + "sav/";
        this.UPLOAD_DIR_JSON = this.UPLOAD_DIR +  "json/";
    }

    public HashMap<String, String> saveFile(MultipartFile file){
        HashMap<String, String> response = new HashMap<>();

        try {

            if (file.isEmpty()) {
                throw new Exception("o argumento passado não é um arquivo valido");
            }

            // Criar um diretorio sav
            Files.createDirectories(Paths.get(this.UPLOAD_DIR_SAV));

            // Criar um nome unico
            UUID UUID_File = UUID.randomUUID();
            String fileName = UUID_File + "_" + file.getOriginalFilename();
            Path filePath = Paths.get(this.UPLOAD_DIR_SAV, fileName);

            // salvar o arquivo
            Files.write(filePath, file.getBytes());

            HashMap<String, String> convertResponse = this.convertToJson(file);

            if(convertResponse.get("status").equals("error")){
                throw new IOException(convertResponse.get("error"));
            }
            // Criar um diretorio json
            Files.createDirectories(Paths.get(this.UPLOAD_DIR_JSON));
            // Criar um nome único para o arquivo JSON
            String jsonFileName = UUID_File + "_sav.json";
            Path jsonFilePath = Paths.get(this.UPLOAD_DIR_JSON, jsonFileName);

            // Salvar o JSON retornado pela API
            Files.writeString(jsonFilePath, convertResponse.get("content"));

            response.put("status", "success");
            response.put("error", null);
            response.put("content", jsonFileName);
            return response;

        } catch (Exception e) {
            response.put("status", "error");
            response.put("error", e.getMessage());
            response.put("content", null);
            return response;
        }
    }

    public HashMap<String, String> convertToJson(MultipartFile file) throws IOException, InterruptedException {
        HashMap<String, String> response = new HashMap<>();
        try {
            if (file.isEmpty()) {
                throw new Exception("O argumento passado não é um arquivo válido");
            }

            // Converter MultipartFile em ByteArrayResource
            byte[] fileContent = file.getBytes();
            ByteArrayResource resource = new ByteArrayResource(fileContent) {
                @Override
                public String getFilename() {
                    return file.getOriginalFilename();
                }
            };

            // Enviar para a API externa
            Mono<String> apiResponseMono = webClient.post()
                    .uri("http://localhost:5148/api/save/upload")
                    .contentType(MediaType.MULTIPART_FORM_DATA)
                    .body(BodyInserters.fromMultipartData("file", resource))
                    .retrieve()
                    .bodyToMono(String.class)
                    .onErrorResume(e -> Mono.just("Erro ao enviar para API: " + e.getMessage()));

            // Bloquear para obter a resposta
            String apiResponse = apiResponseMono.block();

            response.put("status", "success");
            response.put("error", null);
            response.put("content", apiResponse);
            return response;

        } catch (Exception e) {
            response.put("status", "error");
            response.put("error", e.getMessage());
            response.put("content", null);
            return response;
        }
    }

    public HashMap<String, Object> jsonToObject(String jsonFileName){
        HashMap<String, Object> response = new HashMap<>();
        try{
            // Validar o nome do arquivo
            if (jsonFileName == null || jsonFileName.contains("..") || jsonFileName.contains("/")) {
                throw new IllegalArgumentException("Nome de arquivo inválido");
            }

            // Construir o caminho do arquivo
            Path jsonFilePath = Paths.get(this.UPLOAD_DIR_JSON, jsonFileName);

            // Verificar se o arquivo existe
            if (!Files.exists(jsonFilePath)) {
                throw new IOException("Arquivo não encontrado: " + jsonFileName);
            }

            // Ler o conteúdo do arquivo JSON
            String jsonContent = Files.readString(jsonFilePath);

            // Desserializar o JSON em um objeto PokeSav
            PokeSav pokeSav;
            try {
                pokeSav = gson.fromJson(jsonContent, PokeSav.class);
            } catch (Exception e) {
                throw new IOException("Erro ao desserializar JSON: " + e.getMessage());
            }

            response.put("status", "success");
            response.put("error", null);
            response.put("content", pokeSav);
            return response;

        } catch (IOException e) {
            response.put("status", "error");
            response.put("error", e.getMessage());
            response.put("content", null);
            return response;
        }
    }

}
