package com.adamatraore.microservicecommon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCommonApplication.class, args);
	}

}
