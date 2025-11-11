package ejercicios.condicionales;

import java.util.Scanner;

public class Ordenar3Numeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int num1,num2,num3;
		
		System.out.print("Escribe un numero");
		num1 = entrada.nextInt();
		
		System.out.print("Escribe otro numero");
		num2 = entrada.nextInt();

		System.out.print("Escribe el ultimo numero");
		num3 = entrada.nextInt();
		
		if ((num1 >= num2) && (num1 >= num3)) {
			//si estamos aqui num1 es el mayor
			if (num2 >= num3) {
				System.out.print("De mayor a menor " + num1 + "" + num2 + "" + num3);
			}else {
				System.out.print("De mayor a menor " + num1 + "" + num3 + "" + num2);			}
			
		}else if ((num2 >= num1) && (num2 >= num3)) {
			//si estamos aqui num2 es el mayor
			if (num1 >= num3) {
				System.out.print("De mayor a menor " + num2 + "" + num1 + "" + num3);
			}else {
				System.out.print("De mayor a menor " + num2 + "" + num3 + "" + num1);			
			}

		}else {
			//el num3 es el mayor
			if (num1 >= num2) {
				System.out.print("De mayor a menor " + num3 + "" + num1 + "" + num2);
			}else {
				System.out.print("De mayor a menor " + num3 + "" + num2 + "" + num1);			
			}
		}
		
		entrada.close();
	
	}

}
