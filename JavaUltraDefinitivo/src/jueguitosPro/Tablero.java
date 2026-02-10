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
	
		return true;
	}
	
	private boolean comprobarFilas () {
		
		return true;
	}
	
}
