package com.microservice.usermicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.usermicroservice.entity.User;
import com.microservice.usermicroservice.service.UserService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<User> fildAll() {

		return userService.findAll();
	}

	@PostMapping
	public User create(@RequestBody User user) {
		return userService.create(user);
	}

	@PutMapping
	public User update(@RequestBody User user) {
		return userService.update(user);
	}

	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") int id) {
		userService.delete(id);

	}

	@GetMapping(path = { "/{id}" })
	public User findUser(@PathVariable("id") int id) {
		return userService.findById(id);
	}

}
