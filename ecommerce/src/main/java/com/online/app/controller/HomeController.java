package com.online.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home(){
		return "welcome";
	}
	
	@GetMapping("/error")
	public String error(){
		return "error";
	}
}
