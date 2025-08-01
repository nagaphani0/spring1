package com.example.management.service;

import com.example.management.Entity.ProductEntity;
import com.example.management.repositery.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepo;

    public ProductEntity addProduct(ProductEntity dto) {
        return productRepo.save(dto);
    }

    public List<ProductEntity> showProducts() {
        return productRepo.findAll();
    }
}
