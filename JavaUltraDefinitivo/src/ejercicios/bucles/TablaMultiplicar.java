package ejercicios.bucles;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, multiplicacion;

		System.out.println("Dime el numero del que quieras saber la tabla de multiplicar");
		num = entrada.nextInt();

		for (int i = 1 ; i <= 10 ; i++ ) {
			multiplicacion = num * i;
			System.out.println(num + " * " + i + " = " + multiplicacion);

		}
		
		entrada.close();
		
	}

}
