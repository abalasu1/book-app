package com.demo.bookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BkRatingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BkRatingServiceApplication.class, args);
	}

}

