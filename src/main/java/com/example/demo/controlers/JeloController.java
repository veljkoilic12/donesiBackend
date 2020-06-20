package com.example.demo.controlers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jpa.Jelo;
import com.example.demo.services.JeloServiceInterface;

@RestController
public class JeloController {
	
	@Autowired
	private JeloServiceInterface jeloService;
	
	@GetMapping("/jelo")
	public Collection<Jelo> getJela(){
		return null;
	}
	
	@GetMapping("/jelo/{id}")
	public ResponseEntity<Jelo> getJelo(@PathVariable int id) {
		return null;
	}
	
	@GetMapping("{restoran}/jelo")
	public ResponseEntity<Jelo> getJeloByRestoran(@PathVariable int restoran){
		return null;
	}
	
	@PostMapping("/jelo")
	public ResponseEntity<Jelo> addJelo(@RequestHeader("Authorization") String token,@RequestBody Jelo jelo) {
		return null;
	}
	
	@PutMapping("/jelo")
	public ResponseEntity<Jelo> modifyJelo(@RequestHeader("Authorization") String token,@RequestBody Jelo jelo) {
		return null;
	}
	
	@DeleteMapping("/jelo")
	public ResponseEntity<Jelo> deleteJelo(@RequestHeader("Authorization") String token,@RequestBody Jelo jelo) {
		return null;
	}
}
