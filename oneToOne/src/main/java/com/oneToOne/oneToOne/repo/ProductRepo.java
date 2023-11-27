package com.oneToOne.oneToOne.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneToOne.oneToOne.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
