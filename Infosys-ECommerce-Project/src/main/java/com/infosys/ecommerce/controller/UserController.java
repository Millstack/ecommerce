package com.infosys.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.ecommerce.model.User;
import com.infosys.ecommerce.serviceimplementation.UserServiceImp;

@RestController
public class UserController {

	@Autowired
	private UserServiceImp service;
	
//	save user
	@PostMapping("/user")
	public User saveuser (@RequestBody User user) {
		return service.saveUser(user);
	}
	
//	update user
	@PutMapping("/user/{id}")
	public User updateUser (@RequestBody User user, @PathVariable int id) {
		return service.updateUser(user, id);
	}
	
//	get all users
	@GetMapping("/users")
	public List<User> getAllUser(){
		return service.getAllUsers();
	}
	
//	get user by id
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable int id) {
		return service.getUserById(id);
	}
	
//	delete user
	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
	}
}