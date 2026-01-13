package jueguitos;

import ejercicios.metodos.Recursos;

public class Bingo {

	static int [][] tableroBingo = new int [9][10];

	public static void mostrarTablero () {

		for(int i = 0; i < tableroBingo.length; i++) {
			for(int j = 0; j < tableroBingo[0].length; j++) {
				if (tableroBingo[i][j]== 0) {
					System.out.print("X\t ");
				}else {
					System.out.print(tableroBingo[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}

	public static void sacarBola() {

		int bola = Recursos.numAleatorio(90);
		int fila = bola/10;
		int columna = bola % 10;
		System.out.println("Hemos sacado el: " + bola + " va a la fila " + fila + " y columna " + columna);
		//tenemos que saber donde la colocamos
		if (columna == 0) {
			tableroBingo[fila-1][columna-1] = bola;      
		}
		tableroBingo[fila-1][columna-1] = bola;
	}

	public static void generarCarton() {

	}

	public static void main(String[] args) {

		sacarBola();
		mostrarTablero();

	}

}
