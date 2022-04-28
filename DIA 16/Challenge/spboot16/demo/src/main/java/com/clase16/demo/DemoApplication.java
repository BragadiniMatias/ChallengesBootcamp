package com.clase16.demo;

import com.clase16.demo.models.UserModel;
import com.clase16.demo.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication

public class DemoApplication {

	@Autowired
	private PasswordEncoder psE;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}
	@Bean
	protected CommandLineRunner init(final UserRepository ur){
		return args -> {
			UserModel user = new UserModel("Matias", "mbrag@gmail.com", psE.encode("1234"));
			ur.save(user);
		};
	}

}
