package com.oneToOne.oneToOne.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneToOne.oneToOne.Entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
