package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class HelloController {
	
	//@requestParam définit un paramètre qui s'appelle 'name' et dont la valeur par défaut est "MyName"
	@RequestMapping("/hello")
	public String sayHello2(@RequestParam(name="name", required=false, defaultValue="MyName") String name, Model model) {
        model.addAttribute("name", name);
        
        //the return string will be used as the name of the html file to navigate into
        return "hello";
    }
	
	
}
