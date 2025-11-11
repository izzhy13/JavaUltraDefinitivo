package ejercicios.bucles;

import java.util.Scanner;

public class MenuPersistente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int opcion;

		do {

			System.out.println("Que opcion quieres elegir");
			System.out.println("1.Saludar");
			System.out.println("2.Decir la hora");
			System.out.println("3.Agardecer");
			System.out.println("4.Salir");

			opcion = entrada.nextInt();

			switch (opcion) {
			case 1 : 
				System.out.println("Hola buenas!");
				break;
			case 2 :
				System.out.println("Son las 15:89!");
				break;
			case 3:
				System.out.println("Muchas gracias!");
				break;
			case 4:
				System.out.println("Adios!");
				break;

			default:
				System.out.println("Opcion no valida");

			}
		}while (opcion != 4);

		entrada.close();

	}

}
