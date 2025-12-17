package ejercicios.arrays;

import ejercicios.metodos.Recursos;
import java.util.Scanner;

public class MaximoMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el numero de filas y columnas");
		int fila = sc.nextInt();
		int columna = sc.nextInt();

		int [][] matriz = new int [fila][columna];

		Recursos.rellenarMatrizAleatoria(matriz, 100);
		Recursos.mostrarMatriz(matriz);

		int maximo = matriz[0][0];

		for (int i=0; i<matriz.length;i++) {
			for (int j=0; j<matriz[0].length;j++) {
				if (maximo < matriz[i][j]) {
					maximo = matriz[i][j];
				}
			}
		}

		System.out.print("\nEl valor máximo es: " + maximo);

	}
}
