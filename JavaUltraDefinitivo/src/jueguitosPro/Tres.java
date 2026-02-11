package jueguitosPro;

import java.util.Arrays;
import java.util.Scanner;
/*
public class Tres {

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

				 if (turnoJugador) {
					fichaColocada=ponerFicha(fila,columna,fichaJugador);
				}else {
					fichaColocada=ponerFicha(fila,columna,fichaRival);
				} 

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
 */