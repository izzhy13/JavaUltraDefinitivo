package jueguitosPro;

import java.util.Arrays;

public class Tablero {
	private char [][] casillas;
	private int dimension;

	public Tablero() {
		this.dimension = 3;
		this.casillas = new char [dimension][dimension];
		inicializar();
	}

	private void inicializar () {
		for (int i = 0; i < dimension ; i++) { 
			Arrays.fill(casillas[i], '-');
		}
	}

	public void mostrar () { //public, nos interesa que se vea desde la app(otra clase)
		System.out.println("\n Tablero actual \n------------------------");

		for (int i = 0; i < dimension ; i++) { 
			for (int j = 0; j < dimension ; j++) {
				System.out.print(casillas[i][j]  + "\t ");
			}
			System.out.println("  ");
		}
	}

	public boolean colocarFicha (int fila, int columna, char ficha) {

		//vamos a controlar si nos salimos del tablero
		if (fila < 0 || fila >= dimension || columna < 0 || columna >= dimension ) {
			System.out.println("Eso es fuera del tablero!");
			return false;
		} 

		//compruebo si la celda ya esta ocupada
		if (casillas [fila][columna] != '-') {
			System.out.println("Casilla ocupada!");
			return false;
		}

		casillas[fila][columna] = ficha;
		return true;

	} 

	public boolean hayEmpate () {
		for (int i=0; i < dimension ; i++){
			for (int j=0; j < dimension ; j++) {
				if (casillas[i][j]=='-') {
					//si encontramos un guion es que hay un espaco libre y por tanto no acaba el game
					return false;
				}
			}
		}

		//si llegamos aqui no hay guiones, no hay espacios, hay empate
		return true;
	}

	public boolean hayGanador() {
		//divide y venceras
		return comprobarColumnas() || comprobarFilas() || comporbarDiagonalPrincipal() || comprobarDiagonalInversa();
	}

	//metodos privados
	private boolean comporbarDiagonalPrincipal () {
		if (casillas[0][0] == '-' ) {
			return false;
		}

		char primero = casillas[0][0];
		for (int i = 1; i < dimension; i++) {
			if (casillas [i][i] != primero) {
				return false;
			}
		}

		return true;
	}

	private boolean comprobarDiagonalInversa () {
		if (casillas[0][dimension - 1] == '-' ) {
			return false;
		}

		char primero = casillas[0][dimension - 1];
		for (int i = 1; i < dimension; i++) {
			if (casillas [i][dimension - 1 - i] != primero) {
				return false;
			}
		}

		return true;
	}

	private boolean comprobarColumnas () {
		for (int j = 0; j < dimension; j++) { //j porque son columnas
			char primero = casillas [0][j];

			if (primero != '-' && comprobarUnaColumna(j, primero)) {
				return true;
			}
		}
		return false;
	}

	private boolean comprobarUnaColumna (int c, char simbolo) {
		//fijada la columna, me fijo en la fila
		for (int i = 1; i < dimension; i++) { 
			if (casillas[i][c] != simbolo) {
				return false;
			}
		}
		//si llegamos aqui todos los simbolos son iguales
		return true;
	}

	private boolean comprobarFilas () { // Cogemos el primer carácter de la fila
		for (int i = 0; i < dimension; i++) { //i porque son filas
			char primero = casillas [i][0];
			
			// Si no es un hueco vacío, comprobamos si el resto de la fila es igual
			if (primero != '-' && comprobarUnaFila(i, primero)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean comprobarUnaFila (int f, char simbolo) {
		//fijada la fila, me fijo en la columna 
		// Empezamos en 1 porque el 0 ya lo tenemos

		for (int j = 1; j < dimension; j++) { 
			if (casillas[f][j] != simbolo) {
				return false;
			}
		}
		//si llegamos aqui todos los simbolos son iguales
		return true;
	}

}
