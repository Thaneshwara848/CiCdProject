package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCicdPipelineDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCicdPipelineDemo1Application.class, args);
		System.out.println("Application Running....! on Port 9999");
	}

}
