package com.example.ProyectoDGV.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="Pilotos")
public class Pilotos {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer Id;
	private String nombre;
	private String apellido;
	@ManyToOne
	private Escuderias escuderia;
	private int puntos;
	
	public Pilotos(Integer id, String nombre, String apellido, Escuderias escuderia, int puntos) {
		super();
		Id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.escuderia = escuderia;
		this.puntos = puntos;
	}

	public Pilotos() {
		super();
	}

	public Integer getId() {
		return Id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Escuderias getEscuderia() {
		return escuderia;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEscuderia(Escuderias escuderia) {
		this.escuderia = escuderia;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	
}
