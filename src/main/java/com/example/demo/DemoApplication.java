package com.example.demo;

import com.example.demo.user.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo")
public class DemoApplication {
	UserController user = new UserController();



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



}
