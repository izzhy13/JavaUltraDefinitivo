package ejercicios.funcionespredefinidas;

import java.util.Scanner;

public class ContarCaracter {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("dime la frase que quieres que analice");
		String frase = entrada.nextLine();
		
		System.out.println("que letra quieres que busquemos en esa frase");
		String aux = entrada.nextLine();
		
		char letra = aux.charAt(0);
		
		//opcion mas limpia letra = leer.nextLine().charAt(0);
		
		int contador = 0;

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == letra) {
				contador++;
			}
		}

		System.out.println("La frase tiene " + contador + " '" + letra +  "' ");
		entrada.close();

	}

}
