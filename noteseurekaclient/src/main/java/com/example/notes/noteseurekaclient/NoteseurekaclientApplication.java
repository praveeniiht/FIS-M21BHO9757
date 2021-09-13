package com.example.notes.noteseurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;


@SuppressWarnings("deprecation")
@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
@ComponentScan(basePackages="com.example.notes.noteseurekaclient")
public class NoteseurekaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoteseurekaclientApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
