package ejercicios.bucles;

import java.util.Scanner;

public class CuentaAtras {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int num, contadorWhile, contadorDoWhile ;

		System.out.print("Dime un numero para hacer la cuenta atras");
		num = entrada.nextInt();

		//con while (mientras)
		System.out.println("¡Bucle con while!");

		// 1. Inicialización
		contadorWhile = num;	

		// 2. Condición
		while (contadorWhile > 0) {
			System.out.print(contadorWhile + ", ");

			// 3. Actualización
			contadorWhile-- ; // menos 1 (lo mismo que contador = contador -1)
		}

		System.out.println("0.");

		//con do while (repetir)
		System.out.println("\n¡Bucle con do while!"); // \n es para poner un intro

		contadorDoWhile = num;	

		do {
			System.out.print(contadorDoWhile + ", ");
			contadorDoWhile--;

		} while (contadorDoWhile > 0);
		System.out.println("0.");


		//con for (para)
		System.out.println("\n¡Bucle con for!");


		for (int i=num; i>0; i-- )  {
			System.out.print(i + ", ");
		}
		System.out.println("0.");

		entrada.close();      		

	}

}
