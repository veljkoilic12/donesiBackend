package com.example.demo.services;

import com.example.demo.jpa.User;

public interface AuthServiceInterface {
	public String encodeToken(String username,String password);
	public User decodeToken(String token);
}
