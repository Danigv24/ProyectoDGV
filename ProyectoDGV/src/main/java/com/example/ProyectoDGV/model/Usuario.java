package com.example.ProyectoDGV.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Login")
public class Usuario {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer Id;
	@Column(unique = true)
	private String usuario;
	private String contrasenia;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rol_id")
    private Rol rol = new Rol(2);
	@OneToMany(mappedBy="usuario") 
	private List<Pedidos> listaPedidos;
	public Usuario(String usuario, String contrasenia) {
		super();
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		
	}

	protected Usuario() {
		super();
	}

	public Integer getId() {
		return Id;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
		
	}
	
}