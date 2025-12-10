package jueguitos;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();

		int respuesta;

		int num = random.nextInt(100) + 1; //
		System.out.println("Número aleatorio: " + num);

		int intentos = 10;
		System.out.println("Tienes 10 intentos para adivinar el numero del 1 al 100");

		do {
			System.out.println("Cual crees que es el numero aleatorio");
			respuesta = entrada.nextInt(); 

			if (num == respuesta) {
				System.out.println("Felicidades. Has adivinado el número en " + (10 - intentos) + " intentos.");
				break;

			} else if (intentos > 1) {

				if (num < respuesta) {
					System.out.println("el numero es menor");
				}else {
					System.out.println("el numero es mayor");
				}
			}
			intentos--;
			if (intentos > 0) {
				System.out.println("Te quedan " + intentos + " intentos.");
			}

		} while (intentos > 0);

		if (intentos == 0) {
			System.out.println("Lo siento, has agotado tus intentos. El número secreto era: " + num);
		}

		entrada.close();

	}

}
