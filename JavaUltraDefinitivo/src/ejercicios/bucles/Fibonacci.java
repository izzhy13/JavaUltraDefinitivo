package ejercicios.bucles;

import java.util.Scanner;

public class Fibonacci { // f(0) = 0 f(1) = 1 --> f(n) = f(n-1) + f(n-2), con n>=2

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Cuantos terminos de la sucesion de Fibonacci quieres ver?");
		int terminos = entrada.nextInt();

		int antepenultimo = 0;
		int penultimo = 1;
		int actual;
		System.out.println("El termino numero 1 es 0 \nEl termino numero 2 es 1");

		for (int i=3; i<=terminos; i++) {
			actual = penultimo + antepenultimo;
			System.out.println("El termino numero " + i + " es " + actual);

			//actualizamos los terminos
			antepenultimo = penultimo;
			penultimo = actual;

		}

		entrada.close();

	}

}
