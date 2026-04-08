package excepciones;

import java.util.Scanner;

public class NumberFormat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número");
		String entrada = sc.nextLine();

		try {
			// Intentamos la conversión
			int numero = Integer.parseInt(entrada);
			System.out.println("¡Éxito! El número convertido es: " + numero);

		} catch (NumberFormatException e) {
			System.out.println("Error: El texto '" + entrada + "' no tiene un formato válido.");
		}

		sc.close();
	}
}

