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

	public static boolean ponerFicha (int fila, int columna, char ficha) {
		if (tablero[fila][columna] == '-') {
			//esta libre podemos poner la ficha, si devuelve true la ficha se puede colocar
			tablero[fila][columna] = ficha;
			return true;
		}else {
			//no podemos poner la ficha, ya hay una, si devuelve false ya hay ficha
			System.out.println("ya hay una ficha colocada");
			return false;
		}
	} 

	public static boolean hayGanador() {
		//hay 3 en raya en la horizontal
		for (int i=0; i < tablero.length;i++) {
			if ((tablero[i][0]==tablero[i][1] 
					&& tablero[i][1]==tablero[i][2]) && tablero[i][0]!='-') {
				return true;
			}
		}

		//Comprobamos las columnas
		for (int j=0; j< tablero[0].length;j++) {
			if ((tablero[0][j]==tablero[1][j] 
					&& tablero[1][j]==tablero[2][j]) && tablero[0][j]!='-') {
				return true;
			}
		}

		//Ahora con las diagonales
		if ((tablero[0][0]==tablero[1][1] 
				&& tablero[1][1]==tablero[2][2] && tablero[0][0]!='-')
				||
				(tablero[0][2]==tablero[1][1] 
						&& tablero[1][1]==tablero[2][0])  && tablero[0][2]!='-') {
			return true;
		}

		//Si llegamos aquí es que nadie ganó aun
		return false;
	}

	public static boolean hayEmpate() {
		//hay que tener cuidado por si alguien gana en la última jugada
		for (int i=0; i < tablero.length; i++){
			for (int j=0; j < tablero.length; j++) {
				if (tablero[i][j]=='-') {
					//si encontramos un guion es que hay un espaco libre y por tanto no acaba el game
					return false;
				}
			}
		}
		//si llegamos aqui no hay guiones, no hay espacios, hay empate
		return true;
	}

	public static void crearTablero() {
		for (int i = 0; i < tablero.length ; i++) { 
			Arrays.fill(tablero[i], '-');
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fila, columna;
		int jugadorActivo;
		boolean fichaColocada;

		System.out.println("Elige el caracter para el jugador1");
		char fichaJugador = sc.nextLine().charAt(0);
		System.out.println("Elige el caracter para el jugador2");
		char fichaRival = sc.nextLine().charAt(0);

		crearTablero();
		
		//empieza el jugador 1, vamos a llevar el turno por un boolean
		boolean turnoJugador1 = true;

		do {

			do {
				jugadorActivo = (turnoJugador1) ? 1 : 2;
				System.out.println("------------------------");
				System.out.println("Turno del jugador " + jugadorActivo);

				System.out.println("Donde quieres poner la ficha? primero dime la fila y luego la columna (1-3)");
				fila = sc.nextInt()-1;
				columna = sc.nextInt()-1;

				fichaColocada = (turnoJugador1) ? ponerFicha(fila,columna,fichaJugador) : ponerFicha(fila,columna,fichaRival);

				/* if (turnoJugador) {
					fichaColocada=ponerFicha(fila,columna,fichaJugador);
				}else {
					fichaColocada=ponerFicha(fila,columna,fichaRival);
				} */

			} while(!fichaColocada);
			mostrarTablero();
			turnoJugador1 = !turnoJugador1; //si es tru pone false y al reves

		} while (hayGanador() == false && hayEmpate()== false);

		if (hayEmpate()) {
			System.out.println("Empate!");
		} else {
			System.out.println("Ha ganado el jugador " + jugadorActivo + " !!");
		}

		sc.close();

	}

}
