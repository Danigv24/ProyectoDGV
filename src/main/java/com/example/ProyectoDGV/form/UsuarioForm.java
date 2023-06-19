package com.example.ProyectoDGV.form;


import jakarta.validation.constraints.NotNull;


public class UsuarioForm {
	@NotNull
	private String usuario;
	@NotNull
	private String password;
	
	@NotNull
	private String direccion;
	
	@NotNull
	private int codigopostal;

	public String getUsuario() {
		return usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setUsuario(String name) {
		this.usuario = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getCodigopostal() {
		return codigopostal;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setCodigopostal(int codigopostal) {
		this.codigopostal = codigopostal;
	}
	
}
