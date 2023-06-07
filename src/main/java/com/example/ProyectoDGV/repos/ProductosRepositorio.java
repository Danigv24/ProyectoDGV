package com.example.ProyectoDGV.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.ProyectoDGV.model.Productos;

public interface ProductosRepositorio extends CrudRepository<Productos, Integer> {
	Productos findById(int id);
	
	List<Productos> findByEscuderia(String paramescuderia);
}
