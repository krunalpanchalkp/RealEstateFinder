package com.grownited.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@PostMapping("saveuser")
	public String saveUser() {
		return "Login";//jsp
	}
	
	//open forgetpassword jsp 
	@GetMapping("/forgetpassword")
	public String forgetPassword() {
		return "ForgetPassword";
	}

	//submit on forgetpassword -> 
	@PostMapping("sendOtp")
	public String sendOtp() {
		return "ChagePassword";
	}
	 
	@PostMapping("updatepassword")
	public String updatePassword() {
		return "Login";
	}
	
	
	
}