package com.example.ProyectoDGV.DTO;

public class ProductosDTO {

	private String nombreArticulo;
	private String escuderia;
	private int precio;
	private byte[] imagen;
	
	public ProductosDTO(String nombreArticulo, String escuderia, int precio, byte[] imagen) {
		super();
		this.nombreArticulo = nombreArticulo;
		this.escuderia = escuderia;
		this.precio = precio;
		this.imagen = imagen;
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
	
	
}
