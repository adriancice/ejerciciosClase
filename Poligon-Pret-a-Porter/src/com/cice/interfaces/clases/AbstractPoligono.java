package com.cice.interfaces.clases;

import com.cice.interfaces.IPoligono;
import com.cice.interfaces.enums.EnumDesign;
import com.cice.interfaces.enums.EnumMateriales;

public abstract class AbstractPoligono implements IPoligono{
	
	private EnumMateriales material;
	private EnumDesign design;
	private double precio;
	

	protected AbstractPoligono(EnumMateriales material, EnumDesign design) {
		this.material = material;
		this.design = design;
		this.precio = calcularPrecio();		
		//setPrecio(calcularPrecio());
	}
	
	
	protected double getPrecio() {
		return precio;
	}

	protected void setPrecio(double precio) {
		if(precio >= 0) {
		this.precio = precio;
		}
	}
	
	private double calcularPrecio() {
		double precioCalculado = 0d;
		
		precioCalculado = material.getPrecio()*design.getIncremento();
		
		return precioCalculado;
		
	}
	
	@Override
	public void mostrarPrecio() {
		System.out.println("El precio del " + this.getClass().getSimpleName() + " es: " + this.precio);
		
	}

	
	
	

}
