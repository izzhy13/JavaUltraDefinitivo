package poo.app;

import java.util.Scanner;

import poo.Tamagotchi;

public class AppTamagotchi {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		/*
		Tamagotchi tama1 = new Tamagotchi("Pako");
		Tamagotchi tama2 = new Tamagotchi("Pomponpurin", 25, 80);
		Tamagotchi tama3 = new Tamagotchi("Cansino", 55, 10); */

		int opcion;

		System.out.println("Como quieres que se llame tu mascota");
		String nombre = sc.nextLine();

		Tamagotchi mascota = new Tamagotchi(nombre);

		mascota.saludar();

		do {

			System.out.println("Que opcion quieres elegir");
			System.out.println("1.Comer");
			System.out.println("2.Jugar");
			System.out.println("3.Dormir");
			System.out.println("0.Salir");

			opcion = sc.nextInt();

			switch (opcion) {
			case 0 :
				break;
			case 1 :
				mascota.comer();
				break;
			case 2:
				mascota.jugar();
				break;
			case 3:
				mascota.dormir();
				break;
			default:
				System.out.println("Opcion no valida");
			}

			if (opcion != 0) {
				mascota.status();
			} else {
				System.out.println("Adios!!");
			}

		}while (opcion != 0);

		/*tama1.status();
		tama2.status();
		tama3.status();

		tama2.comer();
		tama2.dormir();
		tama2.status();

		tama1.jugar();
		tama1.status();
		tama3.jugar(); */

	}

}
