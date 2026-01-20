package jueguitos;

import java.util.Arrays;
import java.util.Scanner;

public class TresEnRaya {
	// eeeeeeh A MÍ no me va

	static char [][] tablero = new char [3][3];

	public static void mostrarTablero () {
		System.out.println("\n Tablero actual \n------------------------");

		for (int i = 0; i < tablero.length ; i++) { 
			for (int j = 0; j < tablero[0].length ; j++) {
				System.out.print(tablero[i][j]  + "\t ");
			}
			System.out.println("  ");
		}
	}

	public static int ponerFicha (int fila, int columna, char ficha) {
		if (tablero[fila][columna] == '-') {
			//esta libre podemos poner la ficha
			tablero[fila][columna] = ficha;
			return 0;
		}else {
			//no podemos poner la ficha, ya hay una
			System.out.println("ya hay una ficha colocada");
			return -1;
		}
	} 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ficha;

		for (int i = 0; i < tablero.length ; i++) { 
			Arrays.fill(tablero[i], '-');
		}

		System.out.println("Con que quieres jugar X o O");
		ficha = sc.next().charAt(0);
		System.out.println(ficha);

		mostrarTablero();
		ponerFicha(1,2,'X');
		ponerFicha(1,2,'X');
		mostrarTablero();

		sc.close();

	}

}
