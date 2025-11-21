package ejercicios.metodos;

import java.util.Scanner;

public class TablaMultiplicarMetodo {
	
	public static void mostrarTabla (int num) {
		
		for (int i = 0; i<=10; i++) {
			int multiplicacion = num * i;
			System.out.println(num + " * " + i + " = " + multiplicacion);
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame un numero y te muestro la tabla de multiplicar");
		int numero = entrada.nextInt();
		
		//la tabla de un solo numero
		mostrarTabla(numero);

		//la tabla de los N primeros numeros
		for (int i = 1; i <= numero; i++) {
			mostrarTabla(i);
			System.out.println("-----------------");
		}
				
		entrada.close();
		
	}

}
