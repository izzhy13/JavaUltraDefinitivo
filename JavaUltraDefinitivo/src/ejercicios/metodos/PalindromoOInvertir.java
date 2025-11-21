package ejercicios.metodos;

import java.util.Scanner;

public class PalindromoOInvertir { //si no es palincromo le damos la vuelta y decimos si es o no es palindromo

	public static boolean esPalindromo (String p) {

		for (int i = 0; i < ((p.length())/2); i++) { //aqui no hace falta poner -1, ya qe empezamos en el 0 por lo cual no ponemos =
			//System.out.print("\nvoy a comparar " +  i + " con " + ((p.length()-1-i)));
			if (p.charAt(i) != (p.charAt(p.length()-i-1))) { //o (-1+1)
				//System.out.print("entré " + i);
				return false;	
			}
		}
		return true;
	}

	public static String cadenaInvertida(String cadena) {
		String cadenaInvertida = "";
		StringBuilder cadenaTemporal = new StringBuilder();

		for (int i = cadena.length()-1; i>=0; i--) {
			cadenaTemporal.append(cadena.charAt(i));
		}

		cadenaInvertida = cadenaTemporal.toString();
		return cadenaInvertida;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Dime una palabra y te digo si es palindroma o no");
		String palabra = entrada.nextLine();

		if (esPalindromo(palabra)) {
			System.out.println("\nLa palabra es palindroma");
		} else {
			System.out.println("\nLa palabra NO es palindroma ya que al reves es " + cadenaInvertida(palabra));
		}

	}

}
