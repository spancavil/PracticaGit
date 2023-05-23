package com.coderhouse.clasegit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClasegitApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ClasegitApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Server listening. Access H2 on: http://localhost:8888/h2-console");
	}
}
