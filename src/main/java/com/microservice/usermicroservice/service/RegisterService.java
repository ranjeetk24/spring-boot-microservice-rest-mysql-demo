package com.microservice.usermicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.usermicroservice.entity.User;
import com.microservice.usermicroservice.facade.UserRepository;

@Service
public class RegisterService {
	@Autowired
	private UserRepository repository;
	
	public User registerUser(User user) {
		return repository.save(user);
	}
	
	
}
