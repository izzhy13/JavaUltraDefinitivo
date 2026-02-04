package poo.app;

import java.util.ArrayList;
import java.util.Scanner;

import poo.Persona;

public class AppPersonasArrayListV3 {

	static Scanner sc = new Scanner(System.in);
	
	private static void agregarPersona(ArrayList<Persona>personas) {

		String nombre;
		int edad;

		System.out.println("¿Como te llamas?"); // individuo número " + i + " ?");
		nombre = sc.nextLine();
		System.out.println("¿Y cuantos años tienes?"); //manera de que no te pida la edad si ya existe el nombre?
		edad = sc.nextInt();
		sc.nextLine(); //hay que limpiar el buffer

		boolean encontrada = false;

		for (Persona per : personas) {
			if (per.getNombre().equalsIgnoreCase(nombre)) {
				encontrada = true;
				break;
			}
		}
		
		
		for (int i = 0; i < personas.size() ; i++) { //mejor con el contains
			if (personas.get(i).getNombre().equalsIgnoreCase(nombre)) {
				encontrada = true;
				break;
			}
		}

		if (!encontrada) {
			Persona pers = new Persona(nombre,edad);
			personas.add(pers);
		} else {
			System.out.println("ERROR: ese nombre ya es parte de nuestro ArrayList");
		}
	}

	public static void eliminarPersona(ArrayList<Persona>personas) {

		System.out.println("¿A que persona quieres eliminar?, dime su nombre");
		String eliminado = sc.nextLine(); 

		for (int i = 0; i < personas.size(); i++) {
			if(personas.get(i).getNombre().equals(eliminado)) {
				personas.remove(i); 
				i--;
			}	

		}
	}

	public static void saberDatos (ArrayList<Persona>personas) {

		for (int i = 0; i < personas.size(); i++) {
			System.out.println("Me llamo " + personas.get(i).getNombre() + 
					" tengo " + personas.get(i).getEdad());
		}
	}

	public static void main(String[] args) {
		ArrayList<Persona>personas = new ArrayList<>();
		
		int opcion;

		do {

			System.out.println("\n\nQue opcion quieres elegir");
			System.out.println("1.Crear persona");
			System.out.println("2.Eliminar persona");
			System.out.println("3.Saber datos");
			System.out.println("4.Salir");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1 : 
				agregarPersona(personas);
				break;
			case 2 :
				eliminarPersona(personas);
				break;
			case 3:
				saberDatos(personas);
				break;
			case 4:
				System.out.println("Adios!");
				break;

			default:
				System.out.println("Opcion no valida");

			}

		}while (opcion != 4);

		sc.close();

	}

}
