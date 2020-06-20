package com.example.demo.services;

import java.util.Collection;

import com.example.demo.jpa.Kategorija;

public interface KategorijaServiceInterface {
	public Collection<Kategorija> getKategorije();
	public Kategorija getKategorija(int id);
	public boolean addKategorija(String token,Kategorija kategorija);
	public boolean modifyKategorija(String token,Kategorija kategorija);
	public boolean deleteKategorija(String token,Kategorija kategorija);
}
