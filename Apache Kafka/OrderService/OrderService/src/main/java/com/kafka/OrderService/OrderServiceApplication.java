package com.kafka.OrderService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		System.out.println("Inside Order Service");

		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
