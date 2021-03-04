package com.senuraspringboot.example.repository;

import com.senuraspringboot.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    Product findByName(String name);

}
