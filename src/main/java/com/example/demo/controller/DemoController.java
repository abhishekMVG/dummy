package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	@GetMapping("/test1")
	public String test1() {
		return "I am test1 ";
		
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "I am test2";
	}

}
