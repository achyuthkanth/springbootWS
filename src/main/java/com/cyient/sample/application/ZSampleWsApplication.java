package com.cyient.sample.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZSampleWsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ZSampleWsApplication.class, args);
	}
	
}