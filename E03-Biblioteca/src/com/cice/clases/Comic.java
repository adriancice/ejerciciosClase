package com.cice.clases;

import java.sql.Date;

public class Comic extends Base{
	
	private int numero;
	private String coleccion;
	
	public Comic(Date fechaPublicacion, String nombre, int numero, String coleccion) {
		super(fechaPublicacion, nombre);
		this.numero = numero;
		this.coleccion = coleccion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getColeccion() {
		return coleccion;
	}

	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}
	
	
	

}
