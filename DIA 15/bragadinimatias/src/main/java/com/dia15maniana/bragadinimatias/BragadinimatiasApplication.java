package com.dia15maniana.bragadinimatias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableAutoConfiguration
@EnableWebMvc
public class BragadinimatiasApplication {

	public static void main(String[] args) {
		SpringApplication.run(BragadinimatiasApplication.class, args);
	}

}
