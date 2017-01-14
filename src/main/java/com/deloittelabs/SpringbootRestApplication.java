package com.deloittelabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootRestApplication {

	@RequestMapping("/home")
	public String home(){
		return "Welcome to Deloitte Labs - Learn Spring boot by eaxmple";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestApplication.class, args);
	}
}
