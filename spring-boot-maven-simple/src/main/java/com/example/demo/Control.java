package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello from Spring Boot application 2";
	}

}
