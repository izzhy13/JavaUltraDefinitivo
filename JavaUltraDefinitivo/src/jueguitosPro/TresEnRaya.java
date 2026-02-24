package jueguitosPro;

import java.util.Scanner;

public class TresEnRaya { //aqui va la lógica, no en el app, ahi vamos a jugar a muchas cosas
	private Tablero tablero;
	private Jugador j1, j2;
	private Jugador jugadorActivo;

	public TresEnRaya (String nombre1, char ficha1, String nombre2, char ficha2) {
		this.tablero = new Tablero();
		this.j1 = new Jugador (nombre1,ficha1);
		this.j2 = new Jugador (nombre2,ficha2);
		this.jugadorActivo = j1;
	}

	public void inicio () {
		Scanner sc = new Scanner(System.in);
		
		 // Bucle para asegurar que el jugador pone una ficha válida
		boolean finPartida = false;

		while (!finPartida) {

			tablero.mostrar();
			System.out.println("\nTurno de " + jugadorActivo.getNombre() + " (" + jugadorActivo.getFicha() + ")");

			boolean fichaColocada = false;

			while (!fichaColocada) {

				System.out.println("Elige una fila");
				int f = sc.nextInt()-1;
				System.out.println("Elige una columna");
								int c = sc.nextInt()-1;
				fichaColocada = tablero.colocarFicha(f, c, jugadorActivo.getFicha());
			}

			//comprobar si hemos terminado
			if (tablero.hayGanador()) {
				tablero.mostrar();
				System.out.println("Enhorabunea " + jugadorActivo.getNombre() + " has ganado");
				finPartida = true;
			} else if (tablero.hayEmpate()) {
				tablero.mostrar();
				System.out.println("Empate!! no quedan movimientos");
				finPartida = true;
			} else {
				//cambio de jugador
				cambiarTurno();
			}
		}

		sc.close();
	}

	private void cambiarTurno () {
		this.jugadorActivo = (jugadorActivo == j1) ? j2 :j1 ; //entender esto
	}

}
