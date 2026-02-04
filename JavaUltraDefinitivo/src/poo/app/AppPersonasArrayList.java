package poo.app;

import java.util.ArrayList;

import poo.Persona;

public class AppPersonasArrayList {

	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<>();

		//la creación de personas mejora en la V2 con un bucle
		Persona persona1 = new Persona ("Isabel", 23);
		Persona persona2 = new Persona ("Eleazar", 37);
		Persona persona3 = new Persona ("Sidi", 5);

		personas.add(persona1);
		personas.add(persona2);
		personas.add(persona3);

		for (int i = 0; i < personas.size(); i++) {
			System.out.println("Me llamo " + personas.get(i).getNombre() + 
					" tengo " + personas.get(i).getEdad());
		}

		for (int i = 0; i < personas.size(); i++) {
			if (personas.get(i).getEdad() > 18 ) {
				System.out.println(personas.get(i).toString() + " y soy mayor de edad!");
			}

		}

	}

}
