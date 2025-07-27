package com.example.management.controller;

import com.example.management.Entity.ProductEntity;
import com.example.management.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*") // Applies to all methods in this controller
@RestController
public class ToDOController {

    @Autowired
    private ProductService service;

    @GetMapping("/hello")
    public String hello() {
        return "hello Controller";
    }

    @PostMapping("/add")
    public ProductEntity addProduct(@RequestBody ProductEntity data) {
        return service.addProduct(data);
    }
}
