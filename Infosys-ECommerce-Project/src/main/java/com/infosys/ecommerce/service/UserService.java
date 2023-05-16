package com.infosys.ecommerce.service;

import java.util.List;

import com.infosys.ecommerce.model.User;

public interface UserService {

//	save user
	public User saveUser(User user);

//	update user
	public User updateUser(User user, int id);

//	get all users
	public List<User> getAllUsers();

//	get user by id
	public User getUserById(int id);

//	delete user
	public String deleteUser(int id);
}