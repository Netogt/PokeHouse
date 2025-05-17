package com.sdev.pokehome.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.UUID;

@Service
public class FileService {
    private static final String UPLOAD_DIR = "uploads/";

    public static HashMap<String, String> saveFile(MultipartFile file){

        HashMap<String, String> response = new HashMap<>();

        try {

            if (file.isEmpty()) {
                throw new Exception("o argumento passado não é um arquivo valido");
            }

            // Criar um diretorio
            Files.createDirectories(Paths.get(UPLOAD_DIR));

            // Criar um nome unico
            String fileName = UUID.randomUUID() + "_" + file.getOriginalFilename();
            Path filePath = Paths.get(UPLOAD_DIR, fileName);

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
}
