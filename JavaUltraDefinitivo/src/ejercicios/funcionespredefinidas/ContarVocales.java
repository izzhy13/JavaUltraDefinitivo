package ejercicios.funcionespredefinidas;

import java.util.Scanner;

public class ContarVocales {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime una frase");
		String frase = entrada.nextLine().toLowerCase();

		int contador = 0;

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' 
					|| frase.charAt(i) == 'i' || frase.charAt(i) == 'o'
						|| frase.charAt(i) == 'u') {
				contador++;
			}
		}

		System.out.println("La frase tiene " + contador + " vocales");

		entrada.close();

	}
}
