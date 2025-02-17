package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
	}

	@GetMapping("/message")
	public String getMessage() {
		return "Hello satwik you successfully deployed your application using docker";
	}

}
