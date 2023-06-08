package com.example.ProyectoDGV.form;


import jakarta.validation.constraints.NotNull;


public class UsuarioForm {
	@NotNull
	private String userName;
	@NotNull
	private String password;
	
	@NotNull
	private String direccion;
	
	@NotNull
	private int codigopostal;

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setUserName(String name) {
		this.userName = name;
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
