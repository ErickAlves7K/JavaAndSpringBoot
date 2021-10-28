package com.firstproject.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class HelloWorld {
	@GetMapping("/hello")
	public String falar() {
		return "Hello World";
	}
	

}
