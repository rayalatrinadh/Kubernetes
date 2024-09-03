package com.trinadh.user_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class UserServiceApplication {

	@GetMapping("/greetings")
	public String greetings(){
		return "Contgratulations, Successfully deployed application in kubernetes cluster...!";
	}

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
		System.out.println("hello Trinadh Rayala.");
	}

}
