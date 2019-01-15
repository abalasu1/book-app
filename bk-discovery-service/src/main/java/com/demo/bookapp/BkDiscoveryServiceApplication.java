package com.demo.bookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BkDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BkDiscoveryServiceApplication.class, args);
	}

}

