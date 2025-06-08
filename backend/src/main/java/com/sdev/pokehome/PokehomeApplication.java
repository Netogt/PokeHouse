package com.sdev.pokehome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PokehomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokehomeApplication.class, args);
	}

}