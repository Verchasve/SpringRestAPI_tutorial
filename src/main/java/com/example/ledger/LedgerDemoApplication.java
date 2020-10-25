package com.example.ledger;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableAutoConfiguration
@EnableWebMvc
@SpringBootApplication
public class LedgerDemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(LedgerDemoApplication.class, args);
		 
	}
}
