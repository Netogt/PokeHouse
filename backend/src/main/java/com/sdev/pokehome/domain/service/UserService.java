package com.sdev.pokehome.domain.service;

import com.sdev.pokehome.domain.entity.PokeSav;
import com.sdev.pokehome.domain.dto.UserRequestDTO;
import com.sdev.pokehome.domain.entity.Trainer;
import com.sdev.pokehome.domain.entity.User;
import com.sdev.pokehome.domain.repository.TrainerRepository;
import com.sdev.pokehome.domain.repository.UserRepository;
import com.sdev.pokehome.utilities.PokeEnums;
import com.sdev.pokehome.utilities.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TrainerRepository trainerRepository;
    private final String IMAGE_DIR;

    public UserService() {
        this.IMAGE_DIR = "uploads/image";
    }

    public Response<User> store(UserRequestDTO data){
        try{
            String imageURL = "";

            if(data.image() != null){
                Response<String> response = this.uploadImage(data.image());
                if(response.status().equals("error")){
                    throw new Exception(response.error());
                }
                imageURL = response.content();
            }
            if(data.name() == null){ throw new Exception("Nome não informado"); }
            if(data.email() == null){ throw new Exception("Email não informado"); }
            if(data.password() == null){ throw new Exception("Senha não informado"); }

            User newUser = new User();
            newUser.setName(data.name());
            newUser.setEmail(data.email());
            newUser.setPassword(data.password());
            newUser.setImage(imageURL);

            this.userRepository.saveAndFlush(newUser);
            return Response.success(newUser);
        } catch (Exception e) {
            return Response.error(e.getMessage());
        }
    }

    private Response<String> uploadImage(MultipartFile file){
        try {
            if (file.isEmpty()) {
                throw new Exception("o argumento passado não é um arquivo valido");
            }

            String uuid = UUID.randomUUID().toString();
            Files.createDirectories(Path.of(this.IMAGE_DIR));
            Path filePath = Paths.get(this.IMAGE_DIR, uuid + "_" + file.getOriginalFilename());
            Files.write(filePath, file.getBytes());

            return Response.success(filePath.toString());

        } catch (Exception e) {
            return Response.error(e.getMessage());
        }
    }

    public Response<User> getUserByEmail(String email){
        try {
            User user = userRepository.findByEmail(email).orElseThrow(
                    () -> new RuntimeException("Usuario não encontrado")
            );

            return Response.success(user);

        } catch (Exception e) {
            return Response.error(e.getMessage());
        }
    }

    public Response<String> storeData(PokeSav data){
        try {
            if(data == null) throw new Exception("dados fornecidos invalidos para salvar");

            Response<String> setTrainer = this.setTrainer(data);
            if(setTrainer.status().equals("error")) throw new Exception(setTrainer.error());
//            this.setPokemons(data);
//            this.setSave(data);

            return Response.success("");
        } catch (Exception e) {
            return Response.error(e.getMessage());
        }
    }

    private Response<String> setTrainer(PokeSav data){
        try {
            if(data == null) throw new Exception("dados fornecidos invalidos para salvar");
            Trainer newTrainer = new Trainer();
            newTrainer.settID(data.getTid16());
            newTrainer.setsID(data.getSid16());
            newTrainer.setName(data.getOt());
            newTrainer.setGender(data.getGender());
            newTrainer.setBadges(data.getBadges());
            newTrainer.setMoney(data.getMoney());
            newTrainer.setPlayTime(data.getPlayTimeString());
            newTrainer.setSeenCount(data.getSeenCount());
            newTrainer.setCaughtCount(data.getCaughtCount());
            newTrainer.setGameVersion("" + data.getVersion());
            newTrainer.setGameGeneration(data.getGeneration());
            Response<User> getUser = this.getUserByEmail("luiz@gmail.com");
            if(getUser.status().equals("error")) throw new Exception(getUser.error());
            newTrainer.setUser(getUser.content());

            trainerRepository.saveAndFlush(newTrainer);
            return Response.success("treinador salvo");
        } catch (Exception e) {
            return Response.error(e.getMessage());
        }
    }

    private Response<String> setPokemons(Object data){
        try {
            if(data == null) throw new Exception("dados fornecidos invalidos para salvar");

            return Response.success("");
        } catch (Exception e) {
            return Response.error(e.getMessage());
        }
    }

    private Response<String> setSave(Object data){
        try {
            if(data == null) throw new Exception("dados fornecidos invalidos para salvar");

            return Response.success("");
        } catch (Exception e) {
            return Response.error(e.getMessage());
        }
    }
}
