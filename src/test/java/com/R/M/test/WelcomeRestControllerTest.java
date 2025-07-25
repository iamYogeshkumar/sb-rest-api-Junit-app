package com.R.M.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.R.M.rest.WelcomeRestController;
import com.R.M.service.WelcomeService;

@WebMvcTest(controllers = WelcomeRestController.class)
public class WelcomeRestControllerTest {  //represent this class is testClass for the controller for that we are using @WebMvcTest

	@MockBean
	private WelcomeService service;
	
	@Autowired
	private MockMvc mockMvc; // to send http req to restController
	
	@Test
	public void testWelcomeMsg() throws Exception {
		//define mock obj behavior
		when(service.welcomeMsg()).thenReturn("Welcome to India...");
		
		//prepare the req
		MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/welcome");
		//send the req
		 MvcResult result = mockMvc.perform(req).andReturn();
		 //get the response
		 MockHttpServletResponse response = result.getResponse();
		 
		 String contentAsString = response.getContentAsString();
		 System.out.println(contentAsString);
		 
		 int statusCode = response.getStatus();
		 assertEquals(200, statusCode);
		 
		                      
	}
	
	@Test
	public void testGreetMsg() throws Exception {
		when(service.greetMsg()).thenReturn("Mock obj greet you Good Evening ...!!");
		
		MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/greet");
		
		MvcResult result = mockMvc.perform(req).andReturn();
		MockHttpServletResponse response = result.getResponse();
		
		String contentAsString = response.getContentAsString();
		System.out.println(contentAsString);
		int status = response.getStatus();
		assertEquals(200, status);
		
	}
	
	
	
	
}
