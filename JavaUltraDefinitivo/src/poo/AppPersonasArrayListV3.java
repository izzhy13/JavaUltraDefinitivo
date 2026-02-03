package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class AppPersonasArrayListV3 {

	static ArrayList<Persona> personas = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void agregarPersona() {

		String nombre;
		int edad;

		System.out.println("¿Como te llamas individuo número " + i + " ?");
		nombre = sc.nextLine();
		System.out.println("¿Y cuantos años tienes?");
		edad = sc.nextInt();
		sc.nextLine(); //hay que limpiar el buffer porque sino el intro se queda y lo 
		
		if (personas.get(i).getNombre().equals(nombre)) {
			System.out.println("ERROR: ese nombre ya es parte de nuestro ArrayList");
		} else {
			Persona pers = new Persona(nombre,edad);
			personas.add(pers);

		}
	}

	public static void main(String[] args) {

		agregarPersona();
		agregarPersona();
		agregarPersona();

		System.out.println(personas);
		sc.close();

	}

}
