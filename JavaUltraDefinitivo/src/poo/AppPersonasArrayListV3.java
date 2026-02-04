package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class AppPersonasArrayListV3 {

	static ArrayList<Persona> personas = new ArrayList<>(); //esto ns donde ponerlo
	static Scanner sc = new Scanner(System.in);

	public static void agregarPersona() {

		String nombre;
		int edad;

		System.out.println("¿Como te llamas?"); // individuo número " + i + " ?");
		nombre = sc.nextLine();
		System.out.println("¿Y cuantos años tienes?");
		edad = sc.nextInt();
		sc.nextLine(); //hay que limpiar el buffer

		boolean encontrada = false;

		for (int i = 0; i < personas.size() ; i++) {
			if (personas.get(i).getNombre().equalsIgnoreCase(nombre)) {
				encontrada = true;
				break;
			}
		}

		if (encontrada == false) {
			Persona pers = new Persona(nombre,edad);
			personas.add(pers);
		} else {
			System.out.println("ERROR: ese nombre ya es parte de nuestro ArrayList");
		}
	}

	public static void eliminarPersona() {

		System.out.println("¿A que persona quieres eliminar?, dime su nombre");
		String eliminado = sc.nextLine(); 

		for (int i = 0; i < personas.size(); i++) {
			if(personas.get(i).getNombre().equals(eliminado)) {
				personas.remove(i); 
				i--;
			}	

		}
	}

	public static void saberDatos () {

		for (int i = 0; i < personas.size(); i++) {
			System.out.println("Me llamo " + personas.get(i).getNombre() + 
					" tengo " + personas.get(i).getEdad());
		}
	}

	public static void main(String[] args) {
		int opcion;

		do {

			System.out.println("Que opcion quieres elegir");
			System.out.println("1.Crear persona");
			System.out.println("2.Eliminar persona");
			System.out.println("3.Saber datos");
			System.out.println("4.Salir");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1 : 
				agregarPersona();
				break;
			case 2 :
				eliminarPersona();
				break;
			case 3:
				saberDatos();
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
