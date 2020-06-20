package com.example.demo.services;

import com.example.demo.jpa.User;
import java.util.Collection;

public interface UserServiceInterface {
	public Collection<User> getUsers(String token);
	public User getUser(String token,int id);
	public boolean addUser(User user);
	public boolean modifyUser(String token,User user);
	public boolean deleteUser(String token,User user);
}
