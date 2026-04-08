package jueguitosPro;

public class TresEnRayaConTres extends JuegoDeTablero{

	private static final int NUM_FICHAS = 6;
	public TresEnRayaConTres(String nombre1, char ficha1, String nombre2, char ficha2) {
		super(nombre1, ficha1, nombre2, ficha2);
	}

	public void inicio () {

		// Fase 1 colocacion de las 3 fihcas (6 turnos, 3 fichas por jugador)
		System.out.println("Fase de colocacion");
		for (int i = 0; i < NUM_FICHAS; i++) {
			mostrarTurno();
			realizarJugada();

			// en los turnos 5 y 6, puede que termine la partida
			if(tablero.hayGanador()) {
				tablero.mostrar();
				System.out.println("Enhorabuena " + jugadorActivo.getNombre() + " has ganado!!");
				return; //si alguien ha ganado se pira y vuelve al menu de a que quieres juegar
			}
			cambiarTurno();
		}

		// Fase 2 movimiento de fichas
		System.out.println("Fase de movimiento");

		boolean finPartida = false;
		// mientras no acabe la partida, jugamos
		while (!finPartida) {

			mostrarTurno();
			moverFicha();

			if (tablero.hayGanador()) {
				finPartida = true;
			}
		}
	}

	protected void moverFicha() {
		//boolean fichaColocada = false;

		//while (!fichaColocada) {

			System.out.println("Elige una fila");
			int f = sc.nextInt()-1;
			System.out.println("Elige una columna");
			int c = sc.nextInt()-1;
			//fichaColocada = tablero.colocarFicha(f, c, jugadorActivo.getFicha());
		//}
	}

}
