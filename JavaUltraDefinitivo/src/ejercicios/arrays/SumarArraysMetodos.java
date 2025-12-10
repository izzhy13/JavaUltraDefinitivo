package ejercicios.arrays;

import java.util.Scanner;

public class SumarArraysMetodos {

	final static int ELEMENTOS = 5;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] array1 = new int[ELEMENTOS]; 
		int[] array2 = new int[ELEMENTOS]; 
		int[] arraySuma = new int[ELEMENTOS]; 

		System.out.println("vamos a dar valores al array1");
		rellenarArray(array1);
		System.out.println("\nMostrando array 1");
		mostrarArray(array1);

		System.out.println("vamos a dar valores al array2");
		rellenarArray(array2);
		System.out.println("\nMostrando array 2");
		mostrarArray(array2);

		//sumamos los arrays solo si tienen la misma dimensión
		//esto se podria controlar dentro del metodo, mediante control de excepciones
		
		if (array1.length == array2.length) {
			arraySuma = sumarDosArrays(array1,array2);
			System.out.println("\nMostrando array suma");
			mostrarArray(arraySuma);
		}else {
			System.out.println("Los arrayas tienen que ser del mismo tamaño");
		}

		sc.close();

	}

	public static void rellenarArray (int arr[]) {
		//no hace falta devolver nada porque el array cambia en el metodo porque el array es mutable
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\nintroduce el elemento " + (i+1) + ":");
			arr[i] = sc.nextInt();
		}
	}

	public static int[] sumarDosArrays (int[] array1, int[] array2) {
		int[] suma = new int[array1.length];

		for (int i = 0; i < array1.length; i++) {
			suma[i] = array1[i] + array2[i];
		}	

		return suma;
	}
	
	public static void mostrarArray (int[]array) {
		System.out.println("-----------------------");
		/*for (int elemento : array) { //
			System.out.print(elemento + " ");
		}*/ //modo pro
		
		for (int i=0; i<array.length;i++) { //
			System.out.println("posicion[" + i +"]=" + array[i]);
		}
		System.out.println("-----------------------");
	}
}

