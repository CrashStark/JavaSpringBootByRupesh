package com.Feign.FeignClient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FeignClient2Application {

	public static void main(String[] args) {

		System.out.println("Feign Client is running");
		SpringApplication.run(FeignClient2Application.class, args);
	}

}
