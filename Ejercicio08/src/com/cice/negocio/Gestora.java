package com.cice.negocio;


import java.util.Hashtable;
import java.util.Scanner;



/**
 * 
 * @author Adrian Stan
 *
 */

public class Gestora {
	
	Hashtable<String, String> listaContactos = new Hashtable<>();

	
	/**
	 * Método showMenu de la app
	 * 
	 */
	
	public void showMenu() {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		do {
			System.out.println("\n*** GESTION DE LISTA DE CONTACTOS ***");
			System.out.println("1.- Añadir un contacto");
			System.out.println("2.- Eliminar un contacto");
			System.out.println("3.- Mostrar contactos");
			System.out.println("4.- Mostrar dni");
			System.out.println("0.- Salir");			
			System.out.println("------------------------------------");
			System.out.println("Que quieres hacer? \n");
			opcion = sc.nextInt();
			
			controles(opcion);			
		}while (opcion!=0);

	}		
		
		/**
		 * Método controles invoca a los distintos métodos
		 * @param opcion seleccionada
		 * 
		 */
		
		private void controles (int opcion) {
			
			switch(opcion) {
			case 1:
				addContacto();			
				break;					
			case 2:
				eliminarContacto();
				break;
			case 3:
				mostrarContactos();
				break;
			case 0:
				System.out.println("¡¡¡ Hasta pronto !!!");
				break;
			default:
				System.out.println("Opcion invalida, pruebe otravez!");
				break;			
		}		
	}
		
		/**
		 * Metodo addContacto añade un contacto
		 *
		 */
		
		//metodo para añadir contacto
		private void addContacto() {
			Scanner sc = new Scanner(System.in);			
			String nombre, dni, respuesta;
			
			do {
				System.out.print("\nIntroduce el nombre: ");
				nombre = sc.next();
				System.out.print("\nIntroduce el DNI: ");
				dni = sc.next();				
				listaContactos.put(dni, nombre);
							
				System.out.print("\n¿Quieres crear otro contacto? (s/n) ");
				respuesta = sc.next();
			
			} while (respuesta.equals("s"));

			
		}
		
		
		
		//metodo para borrar contacto
		private void eliminarContacto() {
			Scanner sc = new Scanner(System.in);
			String respuesta = "", seleccion;
			
			do {
				System.out.print("Introduce el dni del contacto que vas a eliminar: \n");
				mostrarContactos();
				seleccion = sc.nextLine();
				listaContactos.remove(seleccion);
				System.out.println("Los contactos que quedan son: ");
				mostrarContactos();
				System.out.println("Quies eliminar otro contacto? s/n");
				respuesta = sc.nextLine();
			} while (respuesta.equals("s"));
			
		}

	
		
		
		
		//metodo para mostrar contactos
		private void mostrarContactos() {
			if(listaContactos.size() == 0) {
				System.out.println("No tienes contactos!!!");
				showMenu();
			}
			for (String String : listaContactos.keySet()) {
				System.out.println("[" + String + "]" + " - " + listaContactos.get(String));
			}
			
		}
		
		
	
		
		
		
}
			


