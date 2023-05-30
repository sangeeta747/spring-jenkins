package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsAppDemoApplicationTests {
	
	static Logger logger = LoggerFactory.getLogger(JenkinsAppDemoApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("test() executing");
		assertThat(true);
		
	}

}
