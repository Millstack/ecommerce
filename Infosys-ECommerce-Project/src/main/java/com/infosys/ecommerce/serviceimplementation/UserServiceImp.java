package com.infosys.ecommerce.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.ecommerce.model.User;
import com.infosys.ecommerce.repository.UserRepository;
import com.infosys.ecommerce.service.UserService;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	private UserRepository repository;
	
//	save user
	@Override
	public User saveUser(User user) {
		return repository.save(user);
	}

//	update user
	@Override
	public User updateUser(User user, int id) {
		User u = getUserById(id);
		if(user.getName() != null) {
			u.setName(user.getName());
		}
		if(user.getEmail() != null) {
			u.setEmail(user.getEmail());
		}
		if(user.getGender() != null) {
			u.setGender(user.getGender());
		}
		return repository.save(u);
	}

//	get all users
	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
	}

//	get user by id
	@Override
	public User getUserById(int id) {
		return repository.findById(id).get();
	}

//	delete user
	@Override
	public String deleteUser(int id) {
		repository.deleteById(id);
		return "User with ID " + id + " has been deleted";
	}
}