package com.example.skeleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@OpenAPIDefinition(servers = {
		@Server(url = "https://number-api.kovalev.team"),
		@Server(url = "http://localhost:8082")})
@SpringBootApplication
public class SkeletonApplication {



	public static void main(String[] args) {
		SpringApplication.run(SkeletonApplication.class, args);
	}

}
