package com.example.ProyectoDGV.form;


import jakarta.validation.constraints.NotNull;


public class UsuarioForm {
	@NotNull
	private String userName;
	@NotNull
	private String password;

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
	
}
