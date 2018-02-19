package com.cice.clases;

import java.sql.Date;

import com.cice.interfaces.IPrestable;

public class Libro extends Base implements IPrestable{
	
	private String edicion;
	private String isbn;
	private String autor;
	private boolean prestado;

	public Libro(Date fechaPublicacion, String nombre, String edicion, String isbn, String autor) {
		super(fechaPublicacion, nombre);
		this.edicion = edicion;
		this.isbn = isbn;
		this.autor = autor;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public boolean esPrestado() {
		return this.prestado;
	}

	@Override
	public void cambiarEstado() {
		this.prestado = !this.prestado;
		
	}



	
	
	
	

}
