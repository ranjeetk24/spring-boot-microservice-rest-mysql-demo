package com.microservice.usermicroservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.usermicroservice.entity.User;
import com.microservice.usermicroservice.facade.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User create(User user) {
		return repository.save(user);
	}

	public User delete(int id) {
		User user = findById(id);
		if (user != null) {
			repository.delete(user);
		}
		return user;
	}

	public List findAll() {
		List<User> userList = new ArrayList<User>();
		repository.findAll().forEach(userList::add);
		return userList;
	}

	public User findById(int id) {
		Optional<User> user = repository.findById(id);
		return user.get();
	}

	public User update(User user) {
		return null;
	}

}
