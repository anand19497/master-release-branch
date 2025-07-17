package com.service.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CoupanserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoupanserviceApplication.class, args);
	}

}
