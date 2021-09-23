package com.example.skeleton;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
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
