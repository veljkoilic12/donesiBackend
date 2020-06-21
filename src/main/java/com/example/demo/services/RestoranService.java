package com.example.demo.services;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.jpa.Restoran;
import com.example.demo.jpa.User;
import com.example.demo.repositories.RestoranRepository;

@Service
public class RestoranService implements RestoranServiceInterface {
	
	@Autowired
	private RestoranRepository restoranRepository;
	@Autowired
	private AuthServiceInterface authService;

	@Override
	public Collection<Restoran> getRestorani() {
		return restoranRepository.findAll();
	}

	@Override
	public Restoran getRestoran(int id) {
		return restoranRepository.getOne(id);
	}
	
	@Override
	public Collection<Restoran> findRestoran(String term){
		return restoranRepository.findByImeOrOpis(term, term);
	}

	@Override
	public boolean addRestoran(String token,Restoran restroan) {
		User authUser=authService.decodeToken(token);
		Collection<Restoran> restorani=getRestorani();
		for(Restoran r:restorani)
			if(r.getUsertbl().getId()==authUser.getId())
				return false;
		restroan.setUsertbl(authUser);
		restoranRepository.save(restroan);
		return true;
	}

	@Override
	public boolean modifyRestoran(String token,Restoran restoran) {
		User authUser=authService.decodeToken(token);
		Restoran check=getRestoran(restoran.getId());
		if(check.getId()!=restoran.getId())
			return false;
		restoran.setUsertbl(authUser);
		restoranRepository.save(restoran);
		return false;
	}

	@Override
	public boolean deleteRestoran(String token,Restoran restoran) {
		User authUser=authService.decodeToken(token);
		Restoran check=getRestoran(restoran.getId());
		if(check.getId()!=restoran.getId())
			return false;
		restoranRepository.delete(restoran);
		return true;
	}
	

}
