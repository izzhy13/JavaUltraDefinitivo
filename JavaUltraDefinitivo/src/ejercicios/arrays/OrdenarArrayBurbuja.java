package ejercicios.arrays;

import ejercicios.metodos.Recursos;
import java.util.Scanner;

public class OrdenarArrayBurbuja {

	public static void main(String[] args) {

		//vamos a usar el algoritmo de la burbuja
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el tamaño del array");
		int tamaño = sc.nextInt();

		int [] arr = new int [tamaño];

		Recursos.rellenarArrayAleatorio(arr,100);
		Recursos.mostrarArray(arr);
		System.out.println("-----------------------------------------------------");

		for (int i = 0 ; i < arr.length-1 ; i++) { //-1 porque no vas a comparar el ultimo num
			for (int j = 0 ; j < arr.length-1-i ; j++) { //-1 porque empieza por 0, -n para que no se ejecute de mas, ya que estan ordenados
				if (arr[j] > arr[j+1]) {
					int aux = 0;
					aux = arr[j] ;
					arr[j] = arr[j+1];
					arr[j+1] = aux;
				}
			}
			//Recursos.mostrarArray(arr);
		}
		
		Recursos.mostrarArray(arr);
		sc.close();
	}
}
