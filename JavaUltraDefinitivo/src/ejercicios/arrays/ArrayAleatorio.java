package ejercicios.arrays;

import java.util.Random;

public class ArrayAleatorio {

	public static void main(String[] args) {
		Random random = new Random();

		int[] arrayNumeros = new int[10]; 

		for (int i = 0; i < arrayNumeros.length; i++) {
			arrayNumeros[i] = random.nextInt(100) + 1;
			System.out.println("El numero de la posicion " + i + " es " + arrayNumeros[i] );
			System.out.println("Su cuadrado es " + (int)Math.pow(arrayNumeros[i], 2));
			System.out.println("Su cubo es " + (int)Math.pow(arrayNumeros[i], 3));
			System.out.println("");

		}

	}

}
