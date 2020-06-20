package com.example.demo.services;

import java.util.Collection;

import com.example.demo.jpa.Narudzba;

public interface NarudzbaServiceInterface {
	public Collection<Narudzba> getNarudzbe();
	public Narudzba getNarudzba(int id);
	public boolean addNarudzba(Narudzba narudzba);
	public boolean modifyNarduzba(Narudzba narudzba);
	public boolean deleteNarudzba(Narudzba narudzba);
}
