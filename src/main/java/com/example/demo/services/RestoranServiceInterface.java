package com.example.demo.services;

import com.example.demo.jpa.Restoran;
import java.util.Collection;

public interface RestoranServiceInterface {
	public Collection<Restoran> getRestorani();
	public Restoran getRestoran(int id);
	public boolean addRestoran(Restoran resroan);
	public boolean modifyRestoran(Restoran restoran);
	public boolean deleteRestoran(Restoran restoran);
}
