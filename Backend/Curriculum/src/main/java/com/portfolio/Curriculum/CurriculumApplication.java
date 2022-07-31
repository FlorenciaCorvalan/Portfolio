package com.portfolio.Curriculum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class CurriculumApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurriculumApplication.class, args);
	}

}
