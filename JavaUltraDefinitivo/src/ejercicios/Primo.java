package ejercicios;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		boolean esPrimo;

		System.out.println("dime un numero (positivo) y te digo si es o no primo");
		int num = entrada.nextInt();

		esPrimo = true;

		//cuando un programa se parece un acordeon,la estamos liando y se puede hacer mejor
		if (num > 2) {
			if (num %2==0) {
				esPrimo=false;
			} else { //i+=2 es lo mismo que i=i+2
				for (int i=3; i<=(num/2); i+=2) { //se crea el i en el for y solo existira dentro de este	
					if (num%i == 0) {
						esPrimo=false;
						break; //en el momento que es primo no mira mas; si no lo hacemos con el break usamos un do while
					}
				}//for
			}//else
		}//if

		if (esPrimo) { //si es verdadero hare esto y si no ira al else,hemos puesto antes que era verdadero
			System.out.println("El numero " + num + " es primo");
		}else {
			System.out.println("El numero " + num + " no es primo");
		}
		
		entrada.close();

	}

}
