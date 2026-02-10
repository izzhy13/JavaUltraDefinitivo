package jueguitosPro;

import java.util.Scanner;

public class AppJuegos {

	public static void main(String[] args) {
		//vamos a jugar al tres en raya
		
		TresEnRaya partida = new TresEnRaya("Edu", 'X', "Isa", 'O');
		
		partida.inicio();
		
	}

}
