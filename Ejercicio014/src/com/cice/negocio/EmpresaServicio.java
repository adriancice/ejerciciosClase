package com.cice.negocio;

import java.util.ArrayList;
import java.util.Scanner;

import com.cice.modelo.Departamento;
import com.cice.modelo.Empleado;

/**
 * Clase que gestiona las opciones del programa
 * @author Adrian Stan
 * 
 */

public class EmpresaServicio {
	
	private ArrayList<Empleado> listaEmpleados = new ArrayList<>();
	private ArrayList<Departamento> listaDepartamentos = new ArrayList<>();
	

	
	public void showMenu() {
		
		Scanner sc = new Scanner(System.in);
		
				
		int opcion = 0;

		do {
			System.out.println();
			System.out.println("Bienvenido a tu gestion de Empresa");
			System.out.println("==================================");
			System.out.println("1 - Crear Empleado");
			System.out.println("2 - Crear Departamento");
			System.out.println("3 - Asignar Director a Departamento");
			System.out.println("4 - Asignar empleado a Departamento");
			System.out.println("5 - Mostrar todos los empleados");
			System.out.println("6 - Mostrar todos los Departamentos");
			System.out.println("7 - Mostrar Organigrama Empresa");
			System.out.println("0 - Salir");
			System.out.print(">");
			opcion = sc.nextInt();
		
			controles(opcion);
			

		} while (opcion != 0);
		
		sc.close();
	}
		
		/**
		 * Gestiona la eleccion del usuario en el menu. No sale en JavaDoc por ser private
		 * @param opcion int con la opcion elegida
		 */
	
		private void controles(int opcion) {
			
			switch (opcion) {

			case 1:
				crearEmpleado();
				break;
			case 2:
				crearDepartamento();
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				mostrarEmpleados();
				break;
			case 6:
				mostrarDepartamentos();
				break;
			case 7:
				
				break;
			case 0:
				System.out.println("Gracias por usar nuestra aplicacion!!");
				break;
			default: System.out.println("Opcion Erronea!!");
				break;
			}		
	}
		
		/**
		 * Crea un empleado con los datos que el usuario va introduciendo
		 */
		private void crearEmpleado() {
			Empleado empleado = new Empleado();
			Scanner sc = new Scanner(System.in);
			System.out.print("Introduce un nombre: ");
			empleado.setNombre(sc.next());
			System.out.print("Introduce un apellido: ");
			empleado.setApellido(sc.next());
			System.out.println("-----------------");
			System.out.println(empleado.toString());
			System.out.println("-----------------");
			listaEmpleados.add(empleado);
			
		}
		/**
		 * Muestra una lista de TODOS los empleados, independientemente del departamento en el que esten
		 * 
		 */
		private void mostrarEmpleados() {
				System.out.println("-----------------");
			for (Empleado emp : listaEmpleados) {
				System.out.println(emp.toString());	
				System.out.println("-----------------");
			}
		}
		/**
		 * Crea un Departamento con los datos que suministra el usuario.
		 * Da la opcion de repetir el proceso hasta que el usuario quiera
		 */
		private void crearDepartamento() {			
			Scanner sc = new Scanner(System.in);
			String respuesta = "";
			Departamento departamento;
		
			
			do {				
				departamento = new Departamento();
				System.out.print("Introduce el nombre: ");
				departamento.setNombre(sc.next());
				System.out.println("------------------------");
				System.out.print("quieres crear otro departamento?(s/n): ");
				respuesta = sc.next();
				listaDepartamentos.add(departamento);
				
			} while (respuesta.equals("s"));
		}
		
		/**
		 * Muestra una lista de TODOS los departamentos de la empresa
		 */
		private void mostrarDepartamentos() {
			System.out.println("-----------------");
			for(Departamento dep : listaDepartamentos) {
				System.out.println(dep.getNombre());
			}
			System.out.println("-----------------");			
		}
		
		
		
		
		
		
		
	
}
