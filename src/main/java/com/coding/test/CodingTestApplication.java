package com.coding.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CodingTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingTestApplication.class, args);
	}

}
