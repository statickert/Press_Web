package com.example.netfixEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetfixEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetfixEurekaApplication.class, args);
	}

}
