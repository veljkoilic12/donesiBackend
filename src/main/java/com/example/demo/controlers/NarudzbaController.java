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
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jpa.Jelo;
import com.example.demo.jpa.Narudzba;
import com.example.demo.services.NarudzbaServiceInterface;

@RestController
public class NarudzbaController {
	
	@Autowired
	private NarudzbaServiceInterface narudzbaService;
	
	@GetMapping("/narudzba")
	public Collection<Narudzba> getNarudzbe(){
		return null;
	}
	
	@GetMapping("/narudzba/{id}")
	public Narudzba getNarudzba(@PathVariable int id) {
		return null;
	}
	
	@PostMapping("/narudzba")
	public ResponseEntity<Narudzba> addNarudzba(@RequestBody Narudzba narudzba){
		return null;
	}
	
	//@PutMapping("/narudzba")
	public ResponseEntity<Narudzba> modifyNarudzba(@RequestBody Narudzba narudzba){
		return null;
	}
	
	//@DeleteMapping("/narudzba")
	public ResponseEntity<Narudzba> deleteNarudzba(@RequestBody Narudzba narudzba){
		return null;
	}
}
