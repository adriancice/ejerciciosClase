package com.cice.interfaces.clases;

import com.cice.interfaces.enums.EnumMateriales;

public class Cuadrado extends AbstractPoligono{
	//puede salir por temporada, se hace de otro material (TELA), es estampado, valor añadido del 15%
	private String material;
	private String design;
	private String season;

	
	public Cuadrado(EnumMateriales material) {		
		super(material);
	}
	

	
	
	
}
