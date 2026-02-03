package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class AppPersonasArrayListV2 {

	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		//la creación de personas mejora en la V3 con un método
		for (int i = 1; i <= 3; i++) {
			String nombre;
			int edad;

			System.out.println("¿Como te llamas individuo número " + i + " ?");
			nombre = sc.nextLine();
			System.out.println("¿Y cuantos años tienes?");
			edad = sc.nextInt();
			sc.nextLine(); //hay que limpiar el buffer porque sino el intro se queda y lo 

			Persona pers = new Persona(nombre,edad);
			personas.add(pers);

		}

		// esto mejor en otro método
		System.out.println("¿A que persona quieres eliminar?, dime su nombre");
		String eliminado = sc.nextLine(); 

		for (int i = 0; i < personas.size(); i++) {
			if(personas.get(i).getNombre().equals(eliminado)) {
				personas.remove(i); 
				i--;
			}	

		}
		
		System.out.println(personas);

		sc.close();

	}

}