package com.cice.principal;


import java.util.ArrayList;
import java.util.List;

import com.cice.interfaces.IPoligono;
import com.cice.interfaces.clases.Cuadrado;
import com.cice.interfaces.clases.Pentagono;
import com.cice.interfaces.enums.EnumDesign;
import com.cice.interfaces.enums.EnumMateriales;

public class Main {
	
	public static void main(String[] args) {
		IPoligono poligono = new Cuadrado(EnumMateriales.MADERA, EnumDesign.ESTAMPADO);
		
		poligono.mostrarPrecio();
		
		
		List<IPoligono> listaPoligonos = new ArrayList<IPoligono>();
		listaPoligonos.add(new Cuadrado(EnumMateriales.MADERA, EnumDesign.ESTAMPADO));
		listaPoligonos.add(new Pentagono(EnumMateriales.PLASTICO, EnumDesign.COLOREADO_DEAUTOR));
		
		for (IPoligono poligon : listaPoligonos) {
			poligon.mostrarPrecio();
		}
		
	}
	
	
}
