package com.example.demo.services;

import com.example.demo.jpa.User;
import java.util.Collection;

public interface UserServiceInterface {
	public Collection<User> getUsers();
	public User getUser(int id);
	public boolean addUser(User user);
	public boolean modifyUser(User user);
	public boolean deleteUser(User user);
}
