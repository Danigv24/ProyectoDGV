package com.example.ProyectoDGV.controladores;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


import com.example.ProyectoDGV.model.Productos;
import com.example.ProyectoDGV.repos.ProductosRepositorio;

@Controller
public class ProductosController {
	@Autowired 		// que es auto-generated por Spring, y usaremos para manejar los datos
	private ProductosRepositorio productosRepositorio;
    
    @GetMapping("/productos/imagen/{id}")
    @ResponseBody
    public ResponseEntity<byte[]> mostrarImagen(@PathVariable("id") Integer id) {
        Optional<Productos> optionalProductos = productosRepositorio.findById(id);
        if (optionalProductos.isPresent()) {
        	Productos productos = optionalProductos.get();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_JPEG);
            headers.setContentLength(productos.getImagen().length);
            return new ResponseEntity<>(productos.getImagen(), headers, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    }

