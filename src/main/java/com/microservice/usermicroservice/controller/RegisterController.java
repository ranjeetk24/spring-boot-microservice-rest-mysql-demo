package com.microservice.usermicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.usermicroservice.entity.User;
import com.microservice.usermicroservice.service.RegisterService;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("register")
public class RegisterController {
	@Autowired
	private RegisterService registerService;
	
	@PostMapping
	public void registerUser(@RequestBody User user) {
		registerService.registerUser(user);
	}

}
