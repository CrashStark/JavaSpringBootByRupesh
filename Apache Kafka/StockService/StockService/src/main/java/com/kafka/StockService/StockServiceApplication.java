package com.kafka.StockService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockServiceApplication {

	public static void main(String[] args) {
		System.out.println("Inside StockService");
		SpringApplication.run(StockServiceApplication.class, args);
	}

}
