package com.example.demo.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.LoginInput;
import com.example.demo.services.AuthServiceInterface;

@RestController
public class AuthController {
	
	@Autowired
	private AuthServiceInterface authService;
	
	@PostMapping("/login")
	public String login(@RequestBody LoginInput input){
		String token=authService.encodeToken(input.username, input.password);
		return token;
	}
}
