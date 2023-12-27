package com.JWTAuthentication.JwtAuthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtAuthenticationApplication {

	public static void main(String[] args) {
		System.out.println("Inside JwtAuthentication ");
		SpringApplication.run(JwtAuthenticationApplication.class, args);
	}

}
