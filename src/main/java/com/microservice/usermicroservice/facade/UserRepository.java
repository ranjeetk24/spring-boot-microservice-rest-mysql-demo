package com.microservice.usermicroservice.facade;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservice.usermicroservice.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
