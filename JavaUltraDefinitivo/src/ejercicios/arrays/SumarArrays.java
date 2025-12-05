package ejercicios.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumarArrays {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] array1 = new int[5]; 
		int[] array2 = new int[5]; 
		int[] array3 = new int[5]; 

		for (int i = 0; i < array1.length; i++) {
			System.out.println("Dime numeros para rellenar el array");
			array1[i] = entrada.nextInt();
		}
				
		System.out.println("El array 1 quedó conformado así:" + Arrays.toString(array1)+ "\n");		

		for (int i = 0; i < array2.length; i++) {
			System.out.println("Dime numeros para rellenar el otro array");
			array2[i] = entrada.nextInt();
		}
		
		System.out.println("El array 2 quedó conformado así:" + Arrays.toString(array2)+ "\n");
		
		for (int i = 0; i < array3.length; i++) {
			array3[i] = array1[i] + array2[i];
		}

		System.out.println("\nEl array 3 quedó conformado así:" + Arrays.toString(array3)+ "\n");		
		
		entrada.close();

	}

}
