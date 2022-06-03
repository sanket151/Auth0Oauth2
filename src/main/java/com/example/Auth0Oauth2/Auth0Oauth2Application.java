package com.example.Auth0Oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;


@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class Auth0Oauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(Auth0Oauth2Application.class, args);
	}

}