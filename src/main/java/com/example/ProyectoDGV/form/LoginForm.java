package com.example.ProyectoDGV.form;

import jakarta.validation.constraints.NotNull;

public class LoginForm {
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

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
