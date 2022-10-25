package com.greatlearning.employeemanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// homeController
@RestController

public class HomeController {

	@GetMapping("/")
	public String home() {
		return ("<h1> Assignment 6 </h1>");
	}
	@PostMapping("/post")
	public String post(){
		return null;
	}
}
