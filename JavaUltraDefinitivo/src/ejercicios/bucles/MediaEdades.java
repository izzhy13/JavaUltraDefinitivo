package ejercicios.bucles;

import java.util.Scanner;

public class MediaEdades {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int contadorPersonas = 0;
		int edad;
		int sumaEdades = 0;

		do {
			System.out.println("Dime tu edad");
			edad = entrada.nextInt();

			if (edad > 0) {
				contadorPersonas++;
				sumaEdades += edad;
			}

		}while (edad > 0);

		System.out.println("He contado " + contadorPersonas + " personas!");
		System.out.println("La media de edad es " + (sumaEdades/contadorPersonas));

		entrada.close();		
	}

}


