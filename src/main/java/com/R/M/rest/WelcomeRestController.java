package com.R.M.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.R.M.service.WelcomeService;

@RestController
public class WelcomeRestController {

	@Autowired
	private WelcomeService service;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		System.out.println(service.getClass().getName());
		String msg = service.welcomeMsg();
		return msg;
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		System.out.println(service.getClass().getName());
		String msg = service.greetMsg();
		return msg;
	}
	
	
}
