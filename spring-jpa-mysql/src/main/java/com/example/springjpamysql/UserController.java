package com.example.springjpamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController {
	
	@Autowired 
	UserRepository userRepository;
	
	@RequestMapping("/all")
	public  List<Person> getAll() {
		
		return userRepository.findAll();
	}
	
	@RequestMapping("/first")
	public  String getFirst() {
		
		return userRepository.findAll().get(1).getFirst();
		
	}
	
	@RequestMapping("/num")
	public int getNum() {
		
		return (int) userRepository.count();
		
	}

}
