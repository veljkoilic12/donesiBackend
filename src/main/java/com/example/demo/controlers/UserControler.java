package com.example.demo.controlers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.services.UserServiceInterface;
import com.example.demo.jpa.*;

@RestController
public class UserControler {
	
	@Autowired
	private UserServiceInterface userService;
	
	@GetMapping("/user")
	public Collection<User> getUsers(@RequestHeader("Authorization") String token){
		return userService.getUsers(token);
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@RequestHeader("Authorization") String token,@PathVariable int id) {
		return userService.getUser(token,id);
	}
	
	@PostMapping("/user")
	public ResponseEntity<User> insertUser(@RequestBody User user){
		userService.addUser(user);
		return new ResponseEntity<User>(HttpStatus.OK);
	}
	
	@PutMapping("/user")
	public ResponseEntity<User> modifyUser(@RequestHeader("Authorization") String token,@RequestBody User user){
		if(userService.modifyUser(token,user))
			return new ResponseEntity<User>(HttpStatus.OK);
		else
			return new ResponseEntity<User>(HttpStatus.FORBIDDEN);
	}
	
	@DeleteMapping("/user")
	public ResponseEntity<User> deleteUser(@RequestHeader("Authorization") String token,@RequestBody User user){
		if(userService.deleteUser(token,user))
			return new ResponseEntity<User>(HttpStatus.OK);
		else
			return new ResponseEntity<User>(HttpStatus.FORBIDDEN);
	}
}
