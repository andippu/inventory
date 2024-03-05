package com.invrepo.invrp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InvrpApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvrpApplication.class, args);
	}

}
