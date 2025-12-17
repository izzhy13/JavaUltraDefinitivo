package ejercicios.arrays;

import ejercicios.metodos.Recursos;
import java.util.Scanner;

public class OrdenarArraySeleccion {

	public static void main(String[] args) {

		//vamos a usar el metodo de seleccion directa
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el tamaño del array");
		int tamaño = sc.nextInt();

		int [] arr = new int [tamaño];

		Recursos.rellenarArrayAleatorio(arr,100);
		Recursos.mostrarArray(arr);
		System.out.println("-----------------------------------------------------");
		
		for (int i = 0 ; i < arr.length-1 ; i++) {
			int minimo = arr[i]; 
			int posicion = i;
	
		//miro desde el primero de los que no estan colocados
			for (int j = i+1 ; j < arr.length ; j++) { 
				if (arr[j] < minimo) {
					minimo = arr[j];
					posicion = j;
				}
			}
	
			arr[posicion] = arr[i];
			arr[i] = minimo;
		}

		Recursos.mostrarArray(arr);
		sc.close();
	}
}
