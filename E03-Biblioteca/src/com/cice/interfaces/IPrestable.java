package com.cice.interfaces;

public interface IPrestable {
	
	/**
	 * Metodo que me devuelva el estado 'prestado' del objeto
	 * 
	 */
	
	boolean esPrestado();
	
	/**
	 * Metodo que cambia el estado de 'prestado' del objeto
	 */
	void cambiarEstado();
}
