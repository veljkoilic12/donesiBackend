package com.example.demo.services;

import java.util.Collection;

import com.example.demo.jpa.Stavka;

public interface StavkaServiceInterface {
	public Collection<Stavka> getStavke();
	public Stavka getStavka(int id);
	public boolean addStavka(Stavka stavka);
	public boolean modifyStavka(Stavka stavka);
	public boolean deleteStavka(Stavka stavka);
}
