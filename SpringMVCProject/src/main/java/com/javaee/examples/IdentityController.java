package com.javaee.examples;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class IdentityController {
	
	@RequestMapping(value = "/who")
	
	public String identity (Locale locale, Model model)  {
		model.addAttribute("myName", "Nabil Ouerhani");
		
		return ("identity");
	}
	

}
