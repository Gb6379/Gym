package com.paradigmas.gym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class GymApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymApplication.class, args);
	}

}
