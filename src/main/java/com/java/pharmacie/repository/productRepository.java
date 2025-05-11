package com.java.pharmacie.repository;

import com.java.pharmacie.entities.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository<product, Long> {
}
