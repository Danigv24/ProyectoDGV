package com.example.ProyectoDGV.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Escuderias")
public class Escuderias {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer Id;
	private String nombre;
	private int puntos;
	public Escuderias(Integer id, String nombre, int puntos) {
		super();
		Id = id;
		this.nombre = nombre;
		this.puntos = puntos;
	}


	public Integer getId() {
		return Id;
	}


	public String getNombre() {
		return nombre;
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


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	

}
