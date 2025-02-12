package com.grownited.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sessioncontroller {
	@GetMapping("Signup")
   public String signup() {
		return "Signup";
	}


	@GetMapping("Login")
   public String login() {
		return "Login";
	}
}