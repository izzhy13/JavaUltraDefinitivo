package ejercicios.arrays;

import java.util.Scanner;

public class ImprimirHasta0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int posicion = 0;
		
		int[] arr = new int[10]; 
		
		do {
			System.out.print("Dime numeros para rellenar el array: ");
			arr[posicion]= sc.nextInt();
			posicion++;
		}while (posicion < arr.length && arr[posicion-1] > 0);
		
		//se puede hacer tamb con un do while
		
		for (int i=0; i < arr.length; i++) { 
			if (arr[i] <= 0) {
				break;
			}
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}

}
