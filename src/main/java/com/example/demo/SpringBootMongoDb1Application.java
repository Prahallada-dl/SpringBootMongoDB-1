package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootMongoDb1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootMongoDb1Application.class, args);
		run.close();
	}

}
