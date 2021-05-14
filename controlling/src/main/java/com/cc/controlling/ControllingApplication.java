package com.cc.controlling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EntityScan
public class ControllingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControllingApplication.class, args);
	}

}
