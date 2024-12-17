package com.onlineshopping.namingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistryForOnlineShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryForOnlineShoppingApplication.class, args);
	}

}
