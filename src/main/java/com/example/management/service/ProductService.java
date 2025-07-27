package com.example.management.service;

import com.example.management.Entity.ProductEntity;
import com.example.management.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public ProductEntity addProduct(ProductEntity data) {
        return repo.save(data);
    }
}
