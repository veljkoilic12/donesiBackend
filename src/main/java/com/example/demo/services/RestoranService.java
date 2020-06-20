package com.example.demo.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.example.demo.jpa.Restoran;

@Service
public class RestoranService implements RestoranServiceInterface {

	@Override
	public Collection<Restoran> getRestorani() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restoran getRestoran(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addRestoran(Restoran resroan) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyRestoran(Restoran restoran) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteRestoran(Restoran restoran) {
		// TODO Auto-generated method stub
		return false;
	}

}
