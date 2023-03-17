package com.madhu.jenkin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MadhuTest {
	
	public static Logger logger = LoggerFactory.getLogger(MadhuTest.class);
	

	@Test
	void test() {
	logger.info("Test cse started!!!!!!!!");
	assertEquals(10, 10);
	}

}
