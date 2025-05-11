package com.java.pharmacie.controllers;

import com.java.pharmacie.entities.product;
import com.java.pharmacie.repository.productRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/products")
    public List<product> getproducts(){
        return repository.findAll();
    }
    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable long id){
        repository.deleteById(id);
    }

    @PutMapping("/product")
    public product updateProduct(@RequestBody product product){
        return repository.save(product);
    }




}
