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

import com.example.demo.jpa.Stavka;
import com.example.demo.services.StavkaServiceInterface;

@RestController
public class StavkaController {
	
	@Autowired
	private StavkaServiceInterface stavkaService;
	
	//@("/stavka")
	public Collection<Stavka> getStavke(){
		return null;
	}
	
	//@GetMapping("/stavka/{id}")
	public Stavka getStavka(@PathVariable int stavka) {
		return null;
	}
	
	//("/stavka")
	public ResponseEntity<Stavka> addStavka(@RequestBody Stavka stavka){
		return null;
	}
	
	//@PutMapping("/stavka")
	public ResponseEntity<Stavka> modifyStavka(@RequestBody Stavka stavka){
		return null;
	}
	
	//@DeleteMapping("/stavka")
	public ResponseEntity<Stavka> deleteStavka(@RequestBody Stavka stavka){
		return null;
	}
}
