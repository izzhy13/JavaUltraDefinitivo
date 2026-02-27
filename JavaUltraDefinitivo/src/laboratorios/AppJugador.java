package laboratorios;

import java.util.ArrayList;

public class AppJugador {

	public static void main(String[] args) {
	    System.out.println("Jugadores al inicio " + Jugador.getNumeroJugadores());

		ArrayList<Jugador>jugadores = new ArrayList<>();

		Jugador jugador1 = new Jugador ("Mark", 357);
		Jugador jugador2 = new Jugador ("Isa", 999);
		Jugador jugador3 = new Jugador ("Jhoshua", 589);
		
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		jugadores.add(jugador3);
	
		for (Jugador j : jugadores) {
		    System.out.println("Me llamo " + j.getNombre() + ", este es mi identificador " + j.getIdentificador() + " y mi puntuación " + j.getPuntuacionActual());
		}
		
		Jugador.mostrarResumen();
		
	    System.out.println();
		
	}

}
