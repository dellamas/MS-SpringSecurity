package com.ms.microservicespringsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MicroServiceSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceSpringSecurityApplication.class, args);
	}
	@RestController
	class httpController{
		@GetMapping("/public")
		String publicRoute(){
			return "<h1>rota publica liberada </h1>";
		}
		@GetMapping("/private")
		String privateRoute(){
			return "<h1>rota privada liberada </h1>";
		}


	}


}
