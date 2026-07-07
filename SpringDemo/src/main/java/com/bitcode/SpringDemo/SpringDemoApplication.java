package com.bitcode.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringDemoApplication.class, args);
		System.out.println("Server is up");
	}

}
