package ejercicios.condicionales;

import java.util.Scanner;

public class ParOImpar {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, escribe un numero");
		int num = entrada.nextInt();
		
		entrada.close(); //cuando se pone el close cuando no queremos leer mas
		
		if (num % 2 == 0) {
			System.out.print("el numero: " + num + " es par");
		} else {
			System.out.print("el numero: " + num + " es impar");
		}

	}
	
}
