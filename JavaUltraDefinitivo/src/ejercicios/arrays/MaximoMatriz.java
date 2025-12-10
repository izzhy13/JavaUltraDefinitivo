package ejercicios.arrays;

import java.util.Scanner;

public class MaximoMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el numero de filas y columnas");
		int fila = sc.nextInt();
		int columna = sc.nextInt();

		int [][] matriz = new int [fila][columna];

		for (int i = 0; i < matriz.length; i++) { 
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.println("Dime el numero para rellenar");

			}
		}

	}
}
