package com.cice.supermercado.db.dto;

import com.cice.supermercado.business.enums.EnumCategorias;

public class Conserva extends Producto{

	public Conserva(EnumCategorias categoria, String nombre) {
		super(nombre, categoria);
		
	}
	
    @Override
    public String toString() {
        return "El codigo del producto es: " + getCodigo();
    }

}
