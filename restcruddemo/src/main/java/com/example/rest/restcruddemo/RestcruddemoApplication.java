package com.example.rest.restcruddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.rest.restcruddemo")
public class RestcruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestcruddemoApplication.class, args);
	}

}
