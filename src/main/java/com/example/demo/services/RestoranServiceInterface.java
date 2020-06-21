package com.example.demo.services;

import com.example.demo.jpa.Restoran;
import java.util.Collection;

public interface RestoranServiceInterface {
	public Collection<Restoran> getRestorani();
	public Restoran getRestoran(int id);
	public boolean addRestoran(String token,Restoran resroan);
	public boolean modifyRestoran(String token,Restoran restoran);
	public boolean deleteRestoran(String token,Restoran restoran);
	public Collection<Restoran> findRestoran(String term);
}
