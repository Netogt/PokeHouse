package com.sdev.pokehome.domain.service;

import com.sdev.pokehome.domain.dto.UserRequestDTO;
import com.sdev.pokehome.domain.entity.User;
import com.sdev.pokehome.domain.repository.UserRepository;
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
}
