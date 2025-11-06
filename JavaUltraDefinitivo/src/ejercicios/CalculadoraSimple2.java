package ejercicios;

import java.util.Scanner;

public class CalculadoraSimple2 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Dime un numero");
		int num1 = entrada.nextInt();
		
		System.out.print("Dime otro numero");
		int num2 = entrada.nextInt();
				
		System.out.println("La suma es " + (num1 + num2));
		System.out.println("La resta es " + (num1 - num2));
		System.out.println("La multiplicacion es " + (num1 * num2));
		
		entrada.close();

	}

}
