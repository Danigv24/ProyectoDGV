package com.example.ProyectoDGV.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import com.example.ProyectoDGV.model.Usuario;


public interface Loginrepositorio extends JpaRepository<Usuario, Integer>{
	
	@Query("SELECT u FROM Usuario u WHERE u.usuario = :paramUserName")
	Usuario findByUsuario(@Param("paramUserName") String paramUserName);
}

