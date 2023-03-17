package com.madhu.jenkin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;


@SpringBootApplication
public class NatixisFirstJenkinApplication {
	
	public static Logger logger = LoggerFactory.getLogger(NatixisFirstJenkinApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("application got started!!!!!!!!!!");
		
	}

	public static void main(String[] args) {
		
		logger.info("Running main Spring Boot App!!!!!!!!!!!");
		SpringApplication.run(NatixisFirstJenkinApplication.class, args);
	}

}
