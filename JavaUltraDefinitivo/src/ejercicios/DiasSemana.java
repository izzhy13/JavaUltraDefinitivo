package ejercicios;

import java.util.Scanner;

public class DiasSemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int num;
		
		System.out.print("Dime un numero y te digo que dia de la semana es");
		num = entrada.nextInt();
		
		switch (num) {
			case 1: // si es un int no tengo que ponerle '' si es un caracter si
				System.out.print("Es lunes");
				break;
			case 2:
				System.out.print("Es martes");
				break;
			case 3:
				System.out.print("Es miercoles");
				break;
			case 4:
				System.out.print("Es jueves");
				break;
			case 5:
				System.out.print("Es viernes");
				break;
			case 6:
				System.out.print("Es sabado");
				break;
			case 7:
				System.out.print("Es domingo");
				break;
			default:
				System.out.print("Opcion no valida");
		}
		
		entrada.close();
		
	}

}
