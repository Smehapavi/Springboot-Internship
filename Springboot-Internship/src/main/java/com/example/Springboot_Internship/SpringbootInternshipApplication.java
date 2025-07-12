package com.example.Springboot_Internship;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootInternshipApplication {

//	@Value("${app.jwt-Secret}")
//	private static String jwtSecret;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootInternshipApplication.class, args);
		//System.out.println("JWT KEY" + jwtSecret);
	}

}