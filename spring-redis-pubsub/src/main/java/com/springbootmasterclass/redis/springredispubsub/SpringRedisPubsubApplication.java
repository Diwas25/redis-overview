package com.springbootmasterclass.redis.springredispubsub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRedisPubsubApplication {

	public static void main(String[] args) {
		System.out.println("Application is Running");
		SpringApplication.run(SpringRedisPubsubApplication.class, args);
	}

}
