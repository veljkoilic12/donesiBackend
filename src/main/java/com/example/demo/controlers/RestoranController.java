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

import com.example.demo.jpa.Restoran;
import com.example.demo.services.RestoranServiceInterface;

@RestController
public class RestoranController {
	
	@Autowired
	private RestoranServiceInterface restoranService;
	
	@GetMapping("/restoran")
	public Collection<Restoran> getRestorani(){
		return restoranService.getRestorani();
	}
	
	@GetMapping("/restoran/{id}")
	public Restoran getRestoran(@PathVariable int id) {
		return restoranService.getRestoran(id);
	}
	
	@GetMapping("/restoran/{term}")
	public Collection<Restoran> findRestoran(@PathVariable String term){
		return restoranService.findRestoran(term);
	}
	
	@PostMapping("/restoran")
	public ResponseEntity<Restoran> addRestoran(@RequestHeader("Authorization") String token,@RequestBody Restoran restoran){
		return null;
	}
	
	@PutMapping("/restoran")
	public ResponseEntity<Restoran> modifyRestoran(@RequestHeader("Authorization") String token,@RequestBody Restoran restoran){
		return null;
	}
	
	@DeleteMapping("/restoran")
	public ResponseEntity<Restoran> deleteRestoran(@RequestHeader("Authorization") String token,@RequestBody Restoran restoran){
		return null;
	}
}
