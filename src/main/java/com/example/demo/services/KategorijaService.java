package com.example.demo.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.example.demo.jpa.Kategorija;

@Service
public class KategorijaService implements KategorijaServiceInterface{

	@Override
	public Collection<Kategorija> getKategorije() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Kategorija getKategorija(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addKategorija(String token,Kategorija kategorija) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyKategorija(String token,Kategorija kategorija) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteKategorija(String token,Kategorija kategorija) {
		// TODO Auto-generated method stub
		return false;
	}

}
