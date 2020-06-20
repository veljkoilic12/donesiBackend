package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class DonesiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonesiApplication.class, args);
	}
}
