package com.example.demo.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.jpa.*;

public interface RestoranRepository extends JpaRepository<Restoran, Integer>{
	public Collection<Restoran> findByImeOrOpis(String ime, String opis);
}
