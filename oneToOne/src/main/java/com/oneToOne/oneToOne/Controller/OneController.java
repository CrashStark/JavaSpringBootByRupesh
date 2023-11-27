package com.oneToOne.oneToOne.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oneToOne.oneToOne.Entity.Customer;
import com.oneToOne.oneToOne.repo.CustomerRepo;
import com.oneToOne.oneToOne.repo.ProductRepo;

@RestController
public class OneController {
	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private ProductRepo productRepo;
	@PostMapping("/saveCustomer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerRepo.save(customer);
	}
	@GetMapping("/getCustomer")
	public Customer getCustomer() {
		return (Customer) customerRepo.findAll();
	}
	
	
	@GetMapping("/message")
	public String message() {
		return "One To many Mapping";
	}

}
