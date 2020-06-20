package com.example.demo.services;

import java.util.Collection;

import com.example.demo.jpa.Kategorija;

public interface KategorijaServiceInterface {
	public Collection<Kategorija> getKategorije();
	public Kategorija getKategorija(int id);
	public boolean addKategorija(Kategorija kategorija);
	public boolean modifyKategorija(Kategorija kategorija);
	public boolean deleteKategorija(Kategorija kategorija);
}
