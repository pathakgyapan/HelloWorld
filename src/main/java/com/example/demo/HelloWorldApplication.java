package com.example.demo;

import org.springframework.boot.SpringApplication;
//import various dependencies you want
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//to enable the auto-configuration and also indicate that this is spring boot application
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		//args= argument
	}

}
