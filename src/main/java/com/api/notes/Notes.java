package com.api.notes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Notes {
	public static void main(String[] args) {
		SpringApplication.run(Notes.class, args);
	}
}
