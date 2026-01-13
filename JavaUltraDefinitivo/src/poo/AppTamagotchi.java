package poo;

import java.util.Scanner;

public class AppTamagotchi {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int opcion;
		
		Tamagotchi tama1 = new Tamagotchi("Pako");
		Tamagotchi tama2 = new Tamagotchi("Pomponpurin", 25, 80);
		Tamagotchi tama3 = new Tamagotchi("Cansino", 55, 10);

		do {
			
			System.out.println("Que opcion quieres elegir");
			System.out.println("1.Saber el estado");
			System.out.println("2.Comer");
			System.out.println("3.Jugar");
			System.out.println("4.Dormir");
			System.out.println("5.Salir");
			
			opcion = entrada.nextInt();
			
			switch (opcion) {
			case 1 : 
				tama1.status();
				break;
			case 2 :
				tama1.comer();
				break;
			case 3:
				tama1.jugar();
				break;
			case 4:
				tama1.dormir();
				break;
			case 5:
				System.out.println("Adios!!");
				break;

			default:
				System.out.println("Opcion no valida");
			}
		} while (opcion != 5);
		
		
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
