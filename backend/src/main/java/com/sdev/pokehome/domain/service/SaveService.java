package com.sdev.pokehome.domain.service;

import com.sdev.pokehome.domain.entity.PokeSav;
import com.sdev.pokehome.domain.entity.Save;
import com.sdev.pokehome.domain.entity.Trainer;
import com.sdev.pokehome.domain.entity.User;
import com.sdev.pokehome.domain.repository.SaveRepository;
import com.sdev.pokehome.domain.repository.UserRepository;
import com.sdev.pokehome.utilities.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.google.gson.Gson;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class SaveService {
    @Autowired
    SaveRepository saveRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    private static final String UPLOAD_ROOT = "uploads";
    private static final String SAV_DIR = UPLOAD_ROOT + "/sav";
    private static final String JSON_DIR = UPLOAD_ROOT + "/json";

    private final WebClient webClient;
    private final Gson gson;

    public SaveService(WebClient webClient, Gson gson) {
        this.gson = gson;
        this.webClient = webClient;

        createDirectories(Path.of(SAV_DIR), Path.of(JSON_DIR));
    }

    public Response<String> saveFile(MultipartFile file){
        try {
            if (file.isEmpty()) {
                throw new Exception("o argumento passado não é um arquivo valido");
            }

            Response<User> responseUser = this.userService.getUserByEmail("luiz@gmail.com");
            if(responseUser.status().equals("error")) throw new Exception(responseUser.error());

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

            Response<PokeSav> jsonToObject = this.jsonToObject(convertResponse.content());
            if(jsonToObject.status().equals("error")) throw new Exception(jsonToObject.error());

            Response<Save> storeSaveDB = this.storeSaveDB(
                    responseUser.content(),
                    jsonFilePath.toString(),
                    filePath.toString());
            if(storeSaveDB.status().equals("error")) throw new Exception(storeSaveDB.error());

            Response<String> storeData = userService.storeData(
                    responseUser.content(),
                    jsonToObject.content(),
                    storeSaveDB.content());
            if(storeData.status().equals("error")) throw new Exception(storeData.error());

            return Response.success("dados salvo com sucesso");

        } catch (Exception e) {
            return Response.error(e.getMessage());
        }
    }

    public Response<PokeSav> jsonToObject(String json){
        try{
            if (json == null) {
                throw new IllegalArgumentException("Json não é valido");
            }

            PokeSav pokeSav;
            try {
                pokeSav = gson.fromJson(json, PokeSav.class);
            } catch (Exception e) {
                throw new IOException("Erro ao desserializar JSON: " + e.getMessage());
            }

            return Response.success(pokeSav);
        } catch (IOException e) {
            return Response.error(e.getMessage());
        }
    }

    private Response<Save> storeSaveDB(User user, String jsonPath, String savePath){
        try {
            if(jsonPath.isEmpty() || savePath.isEmpty() ) {
                throw new Exception("dados invalidos para salvar");
            }

            Save newSave = new Save();
            newSave.setPathJson(jsonPath);
            newSave.setPathSav(savePath);
            newSave.setUser(user);
            saveRepository.saveAndFlush(newSave);
            return Response.success(newSave);
        } catch (Exception e) {
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
