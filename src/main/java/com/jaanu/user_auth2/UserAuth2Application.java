package com.jaanu.user_auth2;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserAuth2Application {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.load();

		System.setProperty("USER_AUTH2_POSTGRES_URL", dotenv.get("USER_AUTH2_POSTGRES_URL"));
		System.setProperty("USER_AUTH2_POSTGRES_USERNAME", dotenv.get("USER_AUTH2_POSTGRES_USERNAME"));
		System.setProperty("USER_AUTH2_POSTGRES_PASSWORD", dotenv.get("USER_AUTH2_POSTGRES_PASSWORD"));

		SpringApplication.run(UserAuth2Application.class, args);
	}

}
