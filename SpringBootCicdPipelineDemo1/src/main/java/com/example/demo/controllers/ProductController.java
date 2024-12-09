package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping("/home")
	public String home()
	{
		return "<h1>Hi Welcome to Aprinmg Boot Application</h1>";
	}

}
