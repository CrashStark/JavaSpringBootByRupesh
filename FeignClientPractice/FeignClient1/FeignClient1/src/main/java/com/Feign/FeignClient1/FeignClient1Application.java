package com.Feign.FeignClient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignClient1Application {

	public static void main(String[] args) {
		System.out.println("Feign Client One Is Running");
		SpringApplication.run(FeignClient1Application.class, args);
	}

}
