package com.Mapping.JPAMApping.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mapping.JPAMApping.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
