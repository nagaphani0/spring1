package com.example.management.controller;

import com.example.management.Entity.ProductEntity;
import com.example.management.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*") // Applies to all methods in this controller
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/hello")
    public String hello() {
        return "hello Controller";
    }

    //    @PostMapping("/addproduct")
    @PostMapping
    public ProductEntity addProduct(@RequestBody ProductEntity dto) {
        return service.addProduct(dto);
    }

    @GetMapping
    public List<ProductEntity> allProducts() {
        return service.showProducts();
    }


}
