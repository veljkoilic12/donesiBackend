package com.example.demo.services;

import java.util.Collection;

import com.example.demo.jpa.Jelo;

public interface JeloServiceInterface {
	public Collection<Jelo> getJela();
	public Jelo getJelo(int id);
	public boolean addJelo(String token,Jelo jelo);
	public boolean modifyJelo(String token,Jelo jelo);
	public boolean deleteJelo(String token,Jelo jelo);
}
