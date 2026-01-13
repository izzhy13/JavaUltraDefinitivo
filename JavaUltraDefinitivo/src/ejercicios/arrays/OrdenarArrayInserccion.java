package ejercicios.arrays;

import java.util.Scanner;

import ejercicios.metodos.Recursos;

public class OrdenarArrayInserccion {
	//seria mas eficiente si escribiesemos el numero solo una vez

	public static void main(String[] args) {

		//vamos a usar el metodo de inserccion directa
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el tamaño del array");
		int tamaño = sc.nextInt();

		int [] arr = new int [tamaño];

		Recursos.rellenarArrayAleatorio(arr,100);
		Recursos.mostrarArray(arr);
		System.out.println("-----------------------------------------------------");

		//el bucle de fuera es un for ya que el número de iteraciones está determinado por el tamaño del array
		//el de dentro un do while ya que debe ejecutarse al menos una vez y no sabemos las veces que vamos a comparar

		for (int i=1; i<arr.length ; i++) {
			System.out.println("Vamos a por el elemento: " + arr[i] );

			int j = i;
			do {

				System.out.println("Voy a comparar " + arr[j] + " a ver si es mas pequeño que " + arr[j-1]);

				if (arr[j] < arr[j-1]) { //usar la i es peligroso por lo que usamos j
					//los intercambio
					int aux = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = aux;
					j--;

				}else  {
					//acabo ya esta ordenado
					break;
				}
			}while(j >= 1);
			Recursos.mostrarArray(arr);

		}
		System.out.println("-------------------------------");
		Recursos.mostrarArray(arr);

	}

}
