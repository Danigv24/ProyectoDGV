package com.example.ProyectoDGV.model;


import java.util.Date;
import java.util.concurrent.TimeUnit;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="pedidos")
@XmlRootElement
public class Pedidos {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private int importe;
	private Date fechaPedido;
	private Date fechaEntrega;
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	protected Pedidos() {}

	public Pedidos(int importe) {
		super();
		Date fecha = new Date();
		this.importe = importe;
		this.fechaPedido= new Date();
		this.fechaEntrega= new Date(fecha.getTime() + TimeUnit.DAYS.toMillis(10));
		this.estado="nuevo";
	}
	

	public Integer getId() {
		return id;
	}

	public int getImporte() {
		return importe;
	}

	public Date getFechaPedido() {
		
		return fechaPedido;
	}

	public Date getFechaEntrega() {
		
		return fechaEntrega;
	}

	public String getEstado() {
		return estado;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

	public void setFechaPedido(java.util.Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public void setFechaEntrega(java.util.Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	
}
