package com.example.demo.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.jpa.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService implements UserServiceInterface {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public Collection<User> getUsers() {
		return userRepo.findAll();
	}

	@Override
	public User getUser(int id) {
		return userRepo.getOne(id);
	}

	@Override
	public boolean addUser(User user) {
		userRepo.save(user);
		return true;
	}

	@Override
	public boolean modifyUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
