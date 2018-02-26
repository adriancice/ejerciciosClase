package com.cice.supermercado.business.enums;

import com.cice.supermercado.db.dto.Conserva;
import com.cice.supermercado.db.dto.Fruta;

public enum EnumTipoProducto {
	
	FRUTA(Fruta.class),
	CONSERVA(Conserva.class);
	
	private Class<?> clase;
	
	private EnumTipoProducto(Class<?> clase) {
		this.clase = clase;
	}

	public Class<?> getClase() {
		return clase;
	}
	
	
	

}
