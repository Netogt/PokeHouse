package com.sdev.pokehome.domain.dto;

import org.springframework.web.multipart.MultipartFile;

public record UserRequestDTO(String name, String email, String password, MultipartFile image) {
}
