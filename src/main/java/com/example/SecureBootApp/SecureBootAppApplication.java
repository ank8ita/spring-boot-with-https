package com.example.SecureBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SecureBootAppApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SecureBootAppApplication.class, args);
	}

}
