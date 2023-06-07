package com.example.ProyectoDGV.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="roles")
public class Rol {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer Id;
	private String rolUsuario;
	@OneToMany(mappedBy = "rol")
    private List<Usuario> usuarios;
	@OneToOne(mappedBy = "rol")
	private Productos productos;
	protected Rol(int id) {
		super();
		this.Id=id;
	}
	public Rol() {
		super();
	}
	public Integer getId() {
		return Id;
	}
	public String getRolUsuario() {
		return rolUsuario;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public void setRolUsuario(String rolUsuario) {
		this.rolUsuario = rolUsuario;
	}
	
}
