package com.assignment.hello;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(HelloApplicationTests.class);

	@Test
	void contextLoads() {
		log.info("Tests passed.");
	}

}
