package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	// browser
	// Hello Spring boot Using Java

	@GetMapping("/welcome")  // API 
	public String welcome() {
		return "Hello Springboot Using Java";
	}
	
	
	@GetMapping("/sum/{a}/{b}") // API 
	public int sum(@PathVariable int a , @PathVariable int b)
	{
		return a + b;
	}
	
	
	
	

}
