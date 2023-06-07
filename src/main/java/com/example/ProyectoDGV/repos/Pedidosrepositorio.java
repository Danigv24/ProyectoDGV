package com.example.ProyectoDGV.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.ProyectoDGV.model.Pedidos;
import com.example.ProyectoDGV.model.Usuario;


public interface Pedidosrepositorio extends CrudRepository<Pedidos, Integer>{
	
	List<Pedidos> findAll();
	
	List<Pedidos> findByUsuario(Usuario paramUsuario);
	
	Pedidos findById(int id);
	
	Pedidos deleteById(int id);
}
