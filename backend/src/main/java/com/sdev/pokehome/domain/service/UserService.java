package com.sdev.pokehome.domain.service;

import com.sdev.pokehome.domain.entity.*;
import com.sdev.pokehome.domain.dto.UserRequestDTO;
import com.sdev.pokehome.domain.repository.SaveRepository;
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
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TrainerRepository trainerRepository;
    @Autowired
    private SaveRepository saveRepository;

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

    public Response<String> storeData(User user, PokeSav data, Save save){
        try {
            if(data == null) throw new Exception("dados fornecidos invalidos para salvar");

            Response<Trainer> storeTrainerSB = this.storeTrainerSB(user, data, save);
            if(storeTrainerSB.status().equals("error")) throw new Exception(storeTrainerSB.error());

//            Response<Pokemon> storePokemonDB = this.storePokemonDB(
//                    user, data, save,
//                    storeTrainerSB.content());
//            if(storePokemonDB.status().equals("error")) throw new Exception(storePokemonDB.error());


            return Response.success("");
        } catch (Exception e) {
            return Response.error(e.getMessage());
        }
    }

    private Response<Trainer> storeTrainerSB(User user, PokeSav data, Save save){
        try {
            if(data == null) throw new Exception("dados fornecidos invalidos para salvar");

            Trainer newTrainer = getNewTrainer(data, save, user);
            trainerRepository.saveAndFlush(newTrainer);
            return Response.success(newTrainer);
        } catch (Exception e) {
            return Response.error(e.getMessage());
        }
    }

//    private Response<Pokemon> storePokemonDB(User user, PokeSav data, Save save, Trainer trainer){
//        try {
//            if(data == null) throw new Exception("dados fornecidos invalidos para salvar");
//
//            Pokemon newPokemon = getNewPokemon(user, data, save);
//            return Response.success(newPokemon);
//        } catch (Exception e) {
//            return Response.error(e.getMessage());
//        }
//    }

    private static Trainer getNewTrainer(PokeSav data, Save save, User user) {
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
        newTrainer.setUser(user);
        newTrainer.setSave(save);
        return newTrainer;
    }

//    private static Pokemon getNewPokemon(User user, PokeSav data, Save save){
//        Pokemon newPokemon = new Pokemon();
//        newPokemon.setpID(data.get);
//        newPokemon.setIsShiny();
//        newPokemon.setGender();
//        newPokemon.setSpecies();
//        newPokemon.setNickname();
//        newPokemon.seteXP();
//        newPokemon.setNature();
//        newPokemon.setHeldItem();
//        newPokemon.setAbility();
//        newPokemon.setCurrentFriendship();
//        newPokemon.setLanguage();
//        newPokemon.setGameVersion();
//        newPokemon.setGeneration();
//        newPokemon.setMetLocation();
//        newPokemon.setBall();
//        newPokemon.setMetLevel();
//        newPokemon.setStats();
//        newPokemon.setIvs();
//        newPokemon.setEvs();
//        newPokemon.setMoves();
//
//        newPokemon.setMarkingCircle();
//        newPokemon.setMarkingTriangle();
//        newPokemon.setMarkingSquare();
//        newPokemon.setMarkingHeart();
//        newPokemon.setMarkingCross();
//        newPokemon.setMarkingStar();
//        newPokemon.setMarkingDiamond();
//        newPokemon.settID16();
//        newPokemon.setOriginalTrainerName();
//        newPokemon.setOriginalTrainerGender();
//        newPokemon.setMetLevel();
//
//        newPokemon.setSave(save);
//        newPokemon.setUser(user);
//        return newPokemon;
//    }
}
