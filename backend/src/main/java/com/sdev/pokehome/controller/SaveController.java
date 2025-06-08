package com.sdev.pokehome.controller;

import com.sdev.pokehome.domain.service.FileService;
import com.sdev.pokehome.utilities.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@RestController
@RequestMapping("/api/save")
public class SaveController {
    @Autowired
    FileService fileService;

    @PostMapping("upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            if(file.isEmpty()){
                throw new IOException("O arquivo save não foi definido;");
            }

            Response<String> response = fileService.saveFile(file);
            if(response.status().equals("error")){
                throw new IOException(response.error());
            }
            return ResponseEntity.ok( response.content());
        } catch (IOException e) {
            return  ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}