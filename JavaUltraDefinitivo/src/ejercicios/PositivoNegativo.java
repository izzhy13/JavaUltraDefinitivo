package ejercicios;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int ejecuciones, numeros, positivos,negativos, ceros ;

		System.out.println("Dime cuantos numeros me vas a dar");
		ejecuciones  = entrada.nextInt();

		positivos = 0;
		negativos = 0;
		ceros = 0;

		for ( int i = 1 ; i <= ejecuciones ; i++ ) { //1 parte se ejecuta esas veces / cuando voy a salir del bucle / algo que tiene que cambiar la condicion del bucle
			System.out.print("Dime el numero: " + i);
			numeros = entrada.nextInt();

			if (numeros > 0) {
				positivos++;
			}else if (numeros < 0) {
				negativos++;
			}else {
				ceros++;
			}
		}

		System.out.println("En total han sido: " 
				+ positivos + " positivos " 
				+ negativos + " negativos " 
				+ ceros + " ceros");

		entrada.close();

	}

}
