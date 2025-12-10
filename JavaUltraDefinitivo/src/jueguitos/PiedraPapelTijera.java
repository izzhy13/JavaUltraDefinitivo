package jueguitos;

import java.util.Scanner;

public class PiedraPapelTijera {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[] arrayOpciones = {"Piedra","Papel","Tijera"}; //lo más complicado

		String opcionPlayer = arrayOpciones[pedirOpcion()-1];
		String opcionPC = arrayOpciones[eleccionPC()-1];

		System.out.println("El jugador ha elegido " + opcionPlayer + " y el PC " + opcionPC);

		if (opcionPlayer.equals(opcionPC)) {
			System.out.println("Empate!!");
		}else if ((opcionPlayer.equals("Papel") && opcionPC.equals("Piedra")) ||
				(opcionPlayer.equals("Piedra") && opcionPC.equals("Tijera")) ||
				(opcionPlayer.equals("Tijera") && opcionPC.equals("Papel"))) {
			System.out.println("Ganaste :)");
		}else {
			System.out.println("Perdiste :(");
		}

		sc.close();

	}

	public static int eleccionPC() {
		int eleccion = (int)(Math.random()*3)+1 ; //genera un numero entre 0 y 1
		return eleccion;
	}

	public static int pedirOpcion () {

		int eleccion;
		System.out.println("Elige una opción para empezar a jugar");
		System.out.println("1.Piedra");
		System.out.println("2.Papel");
		System.out.println("3.Tijera");

		do {
			eleccion = sc.nextInt();
			if (eleccion < 1 || eleccion > 3) {
				System.out.println("Revisa tu respuesta");
			}
		}while (eleccion < 1 || eleccion > 3);

		return eleccion;

	}
}
