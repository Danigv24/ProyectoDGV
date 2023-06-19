package com.example.ProyectoDGV.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.ProyectoDGV.model.Escuderias;




public interface Escuderiasrepositorio extends CrudRepository<Escuderias, Integer>{
	
	List<Escuderias> findAll();
	
	Escuderias findById(int id);
	

}
