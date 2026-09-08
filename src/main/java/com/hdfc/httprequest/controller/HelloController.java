package com.hdfc.httprequest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/home")
	public String hello() {
		return "Hello API";
	}
	
	@PostMapping("/save")
	public String save() {
		
		return "record saved";
	}
	
	

}
