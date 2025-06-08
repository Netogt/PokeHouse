package com.sdev.pokehome.controller;

import com.sdev.pokehome.domain.dto.UserRequestDTO;
import com.sdev.pokehome.domain.entity.User;
import com.sdev.pokehome.domain.service.UserService;
import com.sdev.pokehome.utilities.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/store", consumes = "multipart/form-data")
    public ResponseEntity<Object> userStore(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            @RequestParam(value = "image", required = false) MultipartFile image
    ){
        try {
            UserRequestDTO userRequestDTO = new UserRequestDTO(name, email, password, image);
            Response<User> response = this.userService.store(userRequestDTO);
            if(response.status().equals("error")) throw new Exception(response.error());
            User newUser = response.content();
            return ResponseEntity.ok(newUser);
        } catch( Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
