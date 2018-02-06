package com.cice.interfaces.clases;

import com.cice.interfaces.IPoligono;
import com.cice.interfaces.enums.EnumMateriales;

public abstract class AbstractPoligono implements IPoligono{
	
	private EnumMateriales material;
	private double precio;
	
	

	protected AbstractPoligono(EnumMateriales material) {
		this.material = material;
		setPrecioBase();
	}
	
	

	private void setPrecioBase() {
		precio = material.getPrecio();
	}
	
	public abstract void setPrecio();

}
