package com.example.ProyectoDGV;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.ProyectoDGV.model.Productos;
import com.example.ProyectoDGV.repos.ProductosRepositorio;


@SpringBootTest
class ProyectoDgvApplicationTests {
	private Productos producto;
	private List<Productos> listaProducto;
	
	private ProductosRepositorio productorepositorio = Mockito.mock(ProductosRepositorio.class);
	@SuppressWarnings("deprecation")
	@Test
	void contextLoads() {
		MockitoAnnotations.initMocks(this);
		listaProducto = new ArrayList<>();
		producto = new Productos("Camiseta F1", "F1Prueba", 45, "https://i.ebayimg.com/images/g/eOAAAOSwl~VjEN3j/s-l400.png");
		listaProducto.add(producto);
	}

	@Test
	void buscarProductos() {
		when(productorepositorio.findAll()).thenReturn(listaProducto);
		assertEquals(listaProducto, productorepositorio.findAll());
	}
	
	@Test
	void buscarPlatosPorCategoria() {
		when(productorepositorio.findById(anyInt())).thenReturn(producto);
		assertEquals(producto, productorepositorio.findById(1));
	}
}
