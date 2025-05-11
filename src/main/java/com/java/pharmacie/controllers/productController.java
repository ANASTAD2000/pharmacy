package com.java.pharmacie.controllers;

import com.java.pharmacie.entities.product;
import com.java.pharmacie.repository.productRepository;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {
    private final productRepository repository;

    public productController(productRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/product")
    public  product saveProduct(@RequestBody product product){
        return repository.save(product);
    }
}
