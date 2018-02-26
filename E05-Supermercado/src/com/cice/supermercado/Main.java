package com.cice.supermercado;

import com.cice.supermercado.business.ServicioLogistico;
import com.cice.supermercado.business.enums.EnumCategorias;
import com.cice.supermercado.db.dto.Conserva;
import com.cice.supermercado.db.dto.Fruta;

public class Main {

	public static void main(String[] args) {
		
		ServicioLogistico servicioLogistico = new ServicioLogistico();
		servicioLogistico.crearProductoNuevo();
		
		
	}

}
