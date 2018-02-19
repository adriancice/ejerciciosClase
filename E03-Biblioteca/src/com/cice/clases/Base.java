package com.cice.clases;

import java.sql.Date;

public class Base {
	
	private Date fechaPublicacion;
	private String nombre;
	
	//constructor con parametros
	protected Base(Date fechaPublicacion, String nombre) {
		this.fechaPublicacion = fechaPublicacion;
		this.nombre = nombre;
	}

	//getters y setters
	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
