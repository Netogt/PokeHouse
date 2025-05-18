package com.sdev.pokehome.controller;

import com.sdev.pokehome.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;


@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    FileService fileService;

    @PostMapping("upload/file")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            if(file.isEmpty()){
                throw new IOException("O arquivo save não foi definido;");
            }

            HashMap<String, String> response = fileService.saveFile(file);
            if(response.get("status").equals("error")){
                throw new IOException(response.get("error"));
            }
            return ResponseEntity.ok("arquivo salvo com o nome:" +  response.get("content"));
        } catch (IOException e) {
            return  ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("convert/file")
    public ResponseEntity<String> convertFile(@RequestParam("fileName") String fileName) {
        try {
            HashMap<String, String> response = fileService.convertToJson(fileName);
            if(response.get("status").equals("error")){
                throw new IOException(response.get("error"));
            }
            return ResponseEntity.ok(response.get("content"));
        } catch (IOException | InterruptedException e) {
            return  ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}