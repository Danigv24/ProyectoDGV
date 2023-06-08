package com.example.ProyectoDGV.form;

import jakarta.validation.constraints.NotNull;

public class PedidosForm {
	@NotNull
	private int importe;
	private Integer id_cliente;
	public Integer getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}


	public int getImporte() {
		return importe;
	}


	public void setImporte(int importe) {
		this.importe = importe;
	}
	
	
}
