package ejercicios.arraylists;

import java.util.Scanner;
import java.util.ArrayList;

public class EstaEnArrayList {

	public static String primeraEnMayuscula (String cadena) {
		//habría que ir palabra a palabra 
		return Character.toUpperCase(cadena.charAt(0)) + cadena.substring(1);
	}

	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		nombres.add("Jorgi");
		nombres.add("Isabel");
		nombres.add("Hector");
		nombres.add("Francis");
		nombres.add("Pachu");

		System.out.println("Dime un nombre y te digo si esta en la lista");

		String nombreIntroducido = sc.nextLine();
		nombreIntroducido = primeraEnMayuscula(nombreIntroducido);

		//recorriendo el ArrayList
		boolean esta=false;

		for(String n: nombres ) {

			if(n.equals(nombreIntroducido)) {
				esta=true;
				break;
			}
		}

		if (esta=true) {
			System.out.println("Si esta en la lista");
		} else {
			System.out.println("No esta en la lista");
		}

		System.out.println("-----------------------------------------------------------------------");

		//con contains
		boolean tieneNombre = nombres.contains(nombreIntroducido);         

		if (tieneNombre == true) {
			System.out.println("¿Esta el nombre " + nombreIntroducido + " en la lista? si ");
		} else {
			System.out.println("¿Esta el nombre " + nombreIntroducido + " en la lista? no ");
		}

		sc.close();

	}

}
