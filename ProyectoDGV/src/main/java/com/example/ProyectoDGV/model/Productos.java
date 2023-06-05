package com.example.ProyectoDGV.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="Productos")
@XmlRootElement
public class Productos {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer Id;
	
	private String nombreArticulo;
	private String escuderia;
	private int precio;
	
	private byte[] imagen;
	
	@OneToOne()
	@JoinColumn(name="productos")
	private Rol rol;
	public Productos(String nombreArticulo, String escuderia, int precio, byte[] imagen) {
		super();
		this.nombreArticulo = nombreArticulo;
		this.escuderia = escuderia;
		this.precio = precio;
		this.imagen = imagen;
	}
	public Productos() {
		
	}
	public Integer getId() {
		return Id;
	}
	public String getNombreArticulo() {
		return nombreArticulo;
	}
	public String getEscuderia() {
		return escuderia;
	}
	public int getPrecio() {
		return precio;
	}
	public byte[] getImagen() {
		return imagen;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}
	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}
	@Override
	public String toString() {
		return "Productos [Id=" + Id + ", nombreArticulo=" + nombreArticulo + ", escuderia=" + escuderia + ", precio="
				+ precio + "]";
	}
	
	
	
	
}

	

	
