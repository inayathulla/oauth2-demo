package com.javator.oauth2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class Oath2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oath2DemoApplication.class, args);
	}

}
