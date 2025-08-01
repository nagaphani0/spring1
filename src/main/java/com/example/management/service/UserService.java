package com.example.management.service;

import com.example.management.Entity.UserEntity;
import com.example.management.repositery.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public UserEntity addUser(UserEntity dto) {
        // Check if the user already exists
        return userRepo.save(dto);
    }
}
