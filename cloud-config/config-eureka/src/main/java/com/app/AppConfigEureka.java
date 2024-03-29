package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AppConfigEureka {
	
	public static void main(String[] args) {
		SpringApplication.run(AppConfigEureka.class, args);
		System.out.println("comlete....");
	}
}
