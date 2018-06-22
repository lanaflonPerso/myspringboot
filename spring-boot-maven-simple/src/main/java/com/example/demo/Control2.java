package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control2 {
	
	@RequestMapping("/hello2")
	public String sayHello2() {
		return "Hello from controller 2 after changes III-VVV";
	}

}
