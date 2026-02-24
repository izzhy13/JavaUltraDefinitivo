package jueguitosPro;

public class TresEnRayaMisery extends JuegoDeTablero{

	public TresEnRayaMisery(String nombre1, char ficha1, String nombre2, char ficha2) {
		super(nombre1, ficha1, nombre2, ficha2);
	}
		
	public void inicio () {
		boolean finPartida = false;

		while (!finPartida) {

			mostrarTurno();
			realizarJugada();
			
			//comprobar si hemos terminado
			if (tablero.hayGanador()) {
				tablero.mostrar();
				cambiarTurno(); //para decir quien ha ganado, no quien ha perdido
				System.out.println("Enhorabuena " + jugadorActivo.getNombre() + " has ganado");
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

