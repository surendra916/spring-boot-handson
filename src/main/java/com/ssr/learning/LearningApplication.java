package com.ssr.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		System.out.println("Edit from github");
		SpringApplication.run(LearningApplication.class, args);
	}


}
