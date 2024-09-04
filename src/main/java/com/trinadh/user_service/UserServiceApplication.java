package com.trinadh.user_service;

import com.trinadh.user_service.dto.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
public class UserServiceApplication {

	@GetMapping("/greetings")
	public String greetings(){
		return "Contgratulations, Successfully deployed application in kubernetes cluster...!";
	}

	@GetMapping("/users")
	public List<User> loadUsers(){
		return Stream.of(new User(1, "Trinadh", "3nadhmail@gmail.com"),
				new User(2, "Rakesh", "rakeshdatta@gmail.com"),
				new User(3, "Rayala", "rayalanikendukura@gmail.com")).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
		System.out.println("hello Trinadh Rayala.");
	}

}
