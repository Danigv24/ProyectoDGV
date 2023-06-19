package com.example.ProyectoDGV.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.ProyectoDGV.model.Usuario;



public interface Usuariorepositorio extends CrudRepository<Usuario, Integer>{
	
	List<Usuario> findAll();
	
	Usuario findById(int paraId);
	
	Usuario findByUsuario(String paraUsu);

}
