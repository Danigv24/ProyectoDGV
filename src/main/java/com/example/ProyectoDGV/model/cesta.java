package com.example.ProyectoDGV.model;

import java.util.ArrayList;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.ProyectoDGV.repos.ProductosRepositorio;

import jakarta.persistence.Entity;


@Component
public class cesta {
	
	private List<Productos> products = new ArrayList<>();
	@Autowired
	ProductosRepositorio productosrepositorio;

	public void addProduct(int id) {
	    Productos product = productosrepositorio.findById(id);
	    products.add(product);
	}

	public void removeProduct(int id) {
	    Productos productToRemove = null;
	    for (Productos product : products) {
	        if (product.getId() == id) {
	            productToRemove = product;
	            break;
	        }
	    }
	    if (productToRemove != null) {
	        products.remove(productToRemove);
	    }
	}
	public void clearProducts() {
	    products.clear();
	}


	    public List<Productos> getProducts() {
	        return products;
	    }
	    
	    public void setProducts(List<Productos> products) {
	        this.products = products;
	    }
	    public int getTotalPrice() {
	        int totalPrice = 0 ;
	        for (Productos product : products) {
	            totalPrice += product.getPrecio();
	        }
	        return totalPrice;
	    }

		@Override
		public String toString() {
			return "cesta [products=" + products + "]";
		}
	    
}
