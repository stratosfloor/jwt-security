package se.emilnoreen.jwt_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtSecurityApplication.class, args);
		System.out.println(System.getenv("POSTGRES_USERNAME"));
		System.out.println(System.getenv("POSTGRES_PASSWORD"));
	}
	// e9f924ec-b113-47aa-857b-1d75453ec1a7
}
