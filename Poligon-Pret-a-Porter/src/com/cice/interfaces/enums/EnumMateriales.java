package com.cice.interfaces.enums;

public enum EnumMateriales {
	CARTON(100d),
	PLASTICO(320D),
	MADERA(500D);
	
	private double precio;
	
	private EnumMateriales(double precio) {
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	
	
}