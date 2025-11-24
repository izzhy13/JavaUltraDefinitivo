package ejercicios.bucles;

import java.util.Scanner;

public class SumaHasta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		int suma = 0;
		
		do {
		System.out.println("Dime numeros para sumarlos");
		num = entrada.nextInt();
		suma += num; //porque con =+ no me va
		
		}while (num != 0);
		
		System.out.println("La suma de todos esos numeros es " + suma);
		entrada.close();		
	}

}
