package com.dia19.devplacedia19;

import com.dia19.devplacedia19.services.FileStorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class Devplacedia19Application implements CommandLineRunner {
	@Resource
	FileStorageService storageService;

	public static void main(String[] args) {
		SpringApplication.run(Devplacedia19Application.class, args);
	}

	@Override
	public void run(String... arg) throws Exception {
		storageService.deleteAll();
		storageService.init();
	}
}

