package ejercicios.bucles;

import java.util.Scanner;

public class ContarPares {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contadorPares = 0;
        String numerosPares = "";

		for (int i= 0; i < 5; i++) {
			System.out.println("Dime un numero y te digo cuantos son pares");
			int num = entrada.nextInt();

			if (num % 2 == 0) {
				contadorPares++;
                numerosPares += num + " ";
			}
		}

		System.out.println("Hay " + contadorPares + " pares estos son " + numerosPares);
		entrada.close();

	}
}
