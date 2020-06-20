package com.example.demo.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.example.demo.jpa.Jelo;

@Service
public class JeloService implements JeloServiceInterface{

	@Override
	public Collection<Jelo> getJela() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jelo getJelo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addJelo(String token,Jelo jelo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyJelo(String token,Jelo jelo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteJelo(String token,Jelo jelo) {
		// TODO Auto-generated method stub
		return false;
	}

}
