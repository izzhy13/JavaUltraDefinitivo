package ejercicios.funcionespredefinidas;

import java.util.Scanner;

public class ContarVocalesConstante {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		final String VOCALES = "aeiouáéíóúAEIOUÁÉÍÓÚ";
		System.out.println("Escribe una frase y cuento las vocales");
		String frase = entrada.nextLine();

		char caracter;
		int numeroVocales = 0;

		for (int i = 0; i<=frase.length()-1;i++) {
			caracter = frase.charAt(i);
			if (VOCALES.indexOf(caracter) >= 0) { //que 0 porque si me da un - es que no esta
				numeroVocales++;
				System.out.print(caracter);
			} 
		}

		System.out.println("\nEn total hay " + numeroVocales + " vocales");
		entrada.close();
	}
}
