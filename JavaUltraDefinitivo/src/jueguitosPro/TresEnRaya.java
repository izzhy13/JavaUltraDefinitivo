package jueguitosPro;

public class TresEnRaya extends JuegoDeTablero{ //aqui va la lógica, no en el app, ahi vamos a jugar a muchas cosas
	
	public TresEnRaya(String nombre1, char ficha1, String nombre2, char ficha2) {
		super(nombre1, ficha1, nombre2, ficha2);
	}

	public void inicio () {
		
		 // Bucle para asegurar que el jugador pone una ficha válida
		boolean finPartida = false;

		while (!finPartida) {

			mostrarTurno();
			realizarJugada();

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

	}

}
