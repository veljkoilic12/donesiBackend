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

import com.example.demo.jpa.Kategorija;
import com.example.demo.services.KategorijaServiceInterface;

@RestController
public class KategorijaController {
	
	@Autowired
	private KategorijaServiceInterface kategorijaService;
	
	@GetMapping("/kategorija")
	public Collection<Kategorija> getKateorije(){
		return null;
	}
	
	@GetMapping("/kategorija/{id}")
	public Kategorija getKategorija(@PathVariable int id) {
		return null;
	}
	
	@PostMapping("/kategorija")
	public ResponseEntity<Kategorija> addKategorija(@RequestHeader("Authorization") String token,@RequestBody Kategorija kategorija) {
		return null;
	}
	
	@PutMapping("/kategorija")
	public ResponseEntity<Kategorija> moifyKategorija(@RequestHeader("Authorization") String token,@RequestBody Kategorija kategorija) {
		return null;
	}
	
	@DeleteMapping("/kategorija")
	public ResponseEntity<Kategorija> deleteKategorija(@RequestHeader("Authorization") String token,@RequestBody Kategorija kategorija) {
		return null;
	}
}
