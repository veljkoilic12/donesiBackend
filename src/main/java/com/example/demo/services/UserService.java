package com.example.demo.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.jpa.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService implements UserServiceInterface {
	
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private AuthServiceInterface authService;

	@Override
	public Collection<User> getUsers(String token) {
		User auth=decodeUser(token);
		if(auth.getAdmin())
			return userRepo.findAll();
		return new ArrayList<User>();
	}

	@Override
	public User getUser(String token,int id) {
		User auth=decodeUser(token);
		if(auth.getAdmin()||auth.getId()==id)
			return userRepo.getOne(id);
		return null;
	}

	@Override
	public boolean addUser(User user) {
		User savedUser=userRepo.save(user);
		//ako save propadne obraditi savedUser, savedUser nikad nece biti null ???
		return true;
	}

	@Override
	public boolean modifyUser(String token,User user) {
		User auth=decodeUser(token);
		if(auth.getId()==user.getId()||auth.getAdmin()) {
			userRepo.save(user);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteUser(String token,User user) {
		User auth=decodeUser(token);
		if(auth.getId()==user.getId()||auth.getAdmin()) {
			userRepo.delete(user);
			return true;
		}
		return false;
	}
	
	private User decodeUser(String token) {
		return authService.decodeToken(token);
	}

}
