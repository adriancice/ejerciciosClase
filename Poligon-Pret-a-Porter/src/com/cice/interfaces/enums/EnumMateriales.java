package com.cice.interfaces.enums;

public enum EnumMateriales {
	CARTON(100d),
	PLASTICO(320d),
	MADERA(500d),
	TELA(600d);

	
	private double precio;
	
	private EnumMateriales(double precio) {
		this.precio = precio;
	}

	public double getPrecio() {
		return this.precio;
	}

	
}