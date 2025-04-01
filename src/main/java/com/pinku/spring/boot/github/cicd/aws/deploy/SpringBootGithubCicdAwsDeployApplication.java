package com.pinku.spring.boot.github.cicd.aws.deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// https://www.youtube.com/watch?v=21V0w6pVYLY

@SpringBootApplication

@RestController
public class SpringBootGithubCicdAwsDeployApplication {

	@GetMapping("/msg")
	public String message() {
		return "hello ";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootGithubCicdAwsDeployApplication.class, args);
	}

}
