package com.example.ProyectoDGV.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.ProyectoDGV.model.Pilotos;



public interface Pilotosrepositorio extends CrudRepository<Pilotos, Integer>{
	
	List<Pilotos> findAll();
	
	Pilotos findById(int id);
	
}
