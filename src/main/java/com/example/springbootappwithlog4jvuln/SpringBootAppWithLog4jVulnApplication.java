package com.example.springbootappwithlog4jvuln;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppWithLog4jVulnApplication {

	public static void main(String[] args) {
		final Logger logger = LogManager.getLogger(SpringBootAppWithLog4jVulnApplication.class);
		logger.info("Hello World!");
		SpringApplication.run(SpringBootAppWithLog4jVulnApplication.class, args);
	}

}
