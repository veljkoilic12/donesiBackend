package com.example.demo.controlers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
		return userService.getUsers();
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@RequestHeader("Authorization") String token,@PathVariable int id) {
		return userService.getUser(id);
	}
	
	@PostMapping("/user")
	public ResponseEntity<User> insertUser(@RequestBody User user){
		userService.addUser(user);
		return new ResponseEntity<User>(HttpStatus.OK);
	}
	
	@PutMapping("/user")
	public ResponseEntity<User> modifyUser(@RequestHeader("Authorization") String token,@RequestBody User user){
		userService.modifyUser(user);
		return new ResponseEntity<User>(HttpStatus.OK);
	}
	
	@DeleteMapping("/user")
	public ResponseEntity<User> deleteUser(@RequestHeader("Authorization") String token,@RequestBody User user){
		userService.deleteUser(user);
		return new ResponseEntity<User>(HttpStatus.OK);
	}
}
