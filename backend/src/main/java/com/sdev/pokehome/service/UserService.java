package com.sdev.pokehome.service;

import com.sdev.pokehome.domain.entity.User;
import com.sdev.pokehome.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void store(User user){
        userRepository.saveAndFlush(user);
    }
}
