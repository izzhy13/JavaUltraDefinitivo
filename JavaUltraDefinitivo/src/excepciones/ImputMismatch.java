package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ImputMismatch {

	static Scanner sc = new Scanner (System.in);

	public static int leerEntero() { //no hace falta pasarle nada
		int enteroLeido;
		
		while (true) { //creamos un bucle infinito
			System.out.println("Introduce un número entero");
			try {
				enteroLeido = sc.nextInt(); //si peta me voy al catch y no lee el return
				return enteroLeido;
				
			} catch(InputMismatchException e) {
				System.out.println("Eso no es un número entero");
				sc.nextLine();
			}
		}
	}

	public static void main(String[] args) {

		int entero = leerEntero();
		System.out.println("El numero introducido es " + entero);

		sc.close();

	}

}
