package com.example.demo.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.example.demo.jpa.Narudzba;

@Service
public class NarudzbaService implements NarudzbaServiceInterface{

	@Override
	public Collection<Narudzba> getNarudzbe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Narudzba getNarudzba(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addNarudzba(Narudzba narudzba) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyNarduzba(String token,Narudzba narudzba) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteNarudzba(String token,Narudzba narudzba) {
		// TODO Auto-generated method stub
		return false;
	}

}
