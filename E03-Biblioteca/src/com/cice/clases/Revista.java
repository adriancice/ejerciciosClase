package com.cice.clases;

import java.sql.Date;

public class Revista extends Base{
	private int numero;
	private String periodicidad;
	
	public Revista(Date fechaPublicacion, String nombre, int numero, String periodicidad) {
		super(fechaPublicacion, nombre);
		this.numero = numero;
		this.periodicidad = periodicidad;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPeriodicidad() {
		return periodicidad;
	}

	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}
	
	
	
}
