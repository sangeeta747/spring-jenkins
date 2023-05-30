package com.example;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsAppDemoApplication {
	public static Logger logger= LoggerFactory.getLogger(JenkinsAppDemoApplication.class);
    
	@PostConstruct
	public void intt()
	{
		logger.info("post construct init ...");
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsAppDemoApplication.class, args);
		logger.info("running main() of the project...");
	}

}
