package com.R.M.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WelcomeServiceTest {

	@Autowired
	private WelcomeService service;
	
	@Test
	public void testWelcomeMsg() {
		String msg = service.welcomeMsg();
		assertNotNull(msg);
	}
	
	@Test
	public void testGreetMsg() {
		String msg = service.greetMsg();
		assertNotNull(msg);
	}
	
}
