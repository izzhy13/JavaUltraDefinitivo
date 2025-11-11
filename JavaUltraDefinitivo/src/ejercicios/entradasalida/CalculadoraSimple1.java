package ejercicios.entradasalida;

import java.util.Scanner;

public class CalculadoraSimple1 {
	
	public static void main (String[] args) {
		//creamos el scanner
		Scanner entrada = new Scanner (System.in);
		
		//creamos las variables
		int num1;
		int num2;
		int resultadoSuma;
		int resultadoResta;
		int resultadoMultiplicacion;
		
		System.out.print("Dime un numero");
		num1 = entrada.nextInt();
		
		System.out.print("Dime otro numero");
		num2 = entrada.nextInt();
				
		//almacenando calculos
		resultadoSuma = num1 + num2;
		resultadoResta = num1 - num2;
		resultadoMultiplicacion = num1 * num2;
		
		System.out.println("La suma es " + resultadoSuma);
		System.out.println("La resta es " + resultadoResta);
		System.out.println("La multiplicacion es " + resultadoMultiplicacion);
		
		entrada.close();
		
	}

}
