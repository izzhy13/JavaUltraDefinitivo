package ejercicios.funcionespredefinidas;

import java.util.Scanner;

public class ContarPalabras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase y te digo cuantas palabras tienes");
		String frase = sc.nextLine();

		int contadorPalabras = 1;

		for (int i = 0; i <= frase.length()-1; i++) {

			if (frase.charAt(i) == ' ') { // comillas simples porque estamos comparando un caracter
				contadorPalabras++;
			}
		}

		System.out.println("Hay " +  contadorPalabras + " palabras");
		sc.close();
		
	}

}
