package ejercicios.bucles;

import java.util.Scanner;

public class SumaNImpares {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime un numero y te muestro los impares hasta ese");
		int num = entrada.nextInt();
		
		System.out.println("\nversion uno con condicional para filtar los pares");

		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		System.out.println("\nversion dos con forcon un incremento de 2");

		for (int i = 1; i <= num; i+=2) {
			//System.out.println("num de bucle" +i);
			System.out.println(i);
		}
	}
}