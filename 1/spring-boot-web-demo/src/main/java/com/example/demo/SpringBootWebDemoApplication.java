package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The SpringApplication, inside the main is a Spring Boot class. It is used to
 * bootstrap our application. It calls static method run() which takes two
 * arguments, one is class type and second is string array. It starts
 * auto-configured tomcat web server when Spring application is started.
 *
 */
@SpringBootApplication
public class SpringBootWebDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebDemoApplication.class, args);
	}
}
