package com.pinku.spring.boot.github.cicd.aws.deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class SpringBootGithubCicdAwsDeployApplication {

	@GetMapping("/msg")
	public String message() {
		return "hello";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootGithubCicdAwsDeployApplication.class, args);
	}

}
