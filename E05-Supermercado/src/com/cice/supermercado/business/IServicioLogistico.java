package com.cice.supermercado.business;

import java.util.List;

import com.cice.supermercado.db.dto.Producto;

public interface IServicioLogistico {
	
	void crearProductoNuevo();
	
	void editarProducto();
	
	void consultarStockage();
	
	void eliminarProducto(Producto producto);
	
	void buscarProducto(Producto producto);
	
	List<Producto> mostrarListtaProductos();
	
	List<Process> mostrarProductosStockage();
	
}
