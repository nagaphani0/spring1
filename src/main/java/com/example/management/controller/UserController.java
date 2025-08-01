package com.example.management.controller;

import com.example.management.Entity.UserEntity;
import com.example.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*") // Applies to all methods in this controller
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/hello")
    public String hello() {
        return "hello Controller";
    }

    @PostMapping("/register")
    public UserEntity register(@RequestBody UserEntity dto) {

        return service.addUser(dto);
    }
//    @GetMapping("/profile")
//    public String register(@RequestBody UserEntity dto) {
//        return service.profile(dto);
//    }
}
