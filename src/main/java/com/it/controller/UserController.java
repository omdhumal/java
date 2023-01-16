package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	
	@GetMapping("/")
	public String loginApplication() {
		
		return "index";
	}
	
	
	@RequestMapping("/addproduct")
	public String addproduct() {
		
		
		
		return "addproduct_form";
	}

}
