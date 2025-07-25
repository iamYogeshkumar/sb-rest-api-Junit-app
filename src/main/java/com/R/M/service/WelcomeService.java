package com.R.M.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

	public String welcomeMsg() {
		String str="Welcome to Nagpur .. !";
		return str;
	}
	
	
	public String greetMsg() {
		String str="Good morning india !";
		return str;
	}
}
