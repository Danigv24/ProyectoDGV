package com.example.ProyectoDGV.Service;

import org.springframework.stereotype.Service;

import com.example.ProyectoDGV.model.Productos;
import com.example.ProyectoDGV.model.cesta;

@Service
public class CestaService {
    private cesta Cesta;

    public cesta getCesta() {
        if (Cesta == null) {
        	Cesta = new cesta();
        }
        return Cesta;
    }

    public void addProduct(Productos product) {
        getCesta().addProduct(product.getId());
    }

    public void removeProduct(Productos product) {
        getCesta().removeProduct(product.getId());
    }

    public int getTotalPrice() {
        return getCesta().getTotalPrice();
    }
}

