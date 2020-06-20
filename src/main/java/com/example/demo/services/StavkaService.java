package com.example.demo.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.example.demo.jpa.Stavka;

@Service
public class StavkaService implements StavkaServiceInterface {

	@Override
	public Collection<Stavka> getStavke() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stavka getStavka(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addStavka(Stavka stavka) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyStavka(Stavka stavka) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStavka(Stavka stavka) {
		// TODO Auto-generated method stub
		return false;
	}

}
