package com.cice.supermercado.business;

import java.util.List;
import java.util.Scanner;

import com.cice.supermercado.business.enums.EnumCategorias;
import com.cice.supermercado.db.dto.Producto;

public class ServicioLogistico implements IServicioLogistico{
	
	private Scanner sc = null;
	
	
	@Override
	public void crearProductoNuevo() {
		sc = new Scanner(System.in);
		String categoria, nombre;
		Class<? extends Producto> clase;
		
		mostrarCategorias();
		System.out.print("Introduce una categoria: ");
		categoria = sc.nextLine();
		System.out.print("Introduce un tipo: ");
		
		
		sc.close();		
	}

	@Override
	public void editarProducto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultarStockage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarProducto(Producto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarProducto(Producto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Producto> mostrarListtaProductos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Process> mostrarProductosStockage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private void mostrarCategorias() {
		int contador = 0;
		for (EnumCategorias e : EnumCategorias.values()) {
			System.out.println(++contador + " ~ " + e.toString());
		}	
	}
	
	
}
