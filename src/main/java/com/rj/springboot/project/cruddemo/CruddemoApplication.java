package com.rj.springboot.project.cruddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
		System.out.println("This might create a conflict");
		System.out.println("And this might create a conflict");
	}

}
