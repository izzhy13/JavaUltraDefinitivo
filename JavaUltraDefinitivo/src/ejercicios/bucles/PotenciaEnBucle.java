package ejercicios.bucles;

import java.util.Scanner;

public class PotenciaEnBucle {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime dos numeros, uno para que sea la base y el otro el exponente");
		double  base = entrada.nextDouble();
		int exponente = entrada.nextInt();
		double resultado = 1;
				
		for (int i = 1; i <= exponente; i++) {
			resultado = resultado * base;
		}
		
		System.out.println(resultado);

	}

}
