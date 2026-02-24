package jueguitosPro;

import java.util.Scanner;

public class AppJuegos {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int opcion;

		do {

			System.out.println("-------- BIENVENIDO A LA CONSOLA DE JUEGOS --------");
			System.out.println("A que quieres jugar");
			System.out.println("0.Salir");
			System.out.println("1.Tres En Raya");
			System.out.println("2.Tres En Raya Misery");
			System.out.println("---------------------------------------------------");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 0:
				System.out.println("Adios!");
				break;
			case 1 : 
				TresEnRaya partida1 = new TresEnRaya("Edu", 'X', "Isa", 'O');
				partida1.inicio();
				break;
			case 2 :
				TresEnRayaMisery partida2 = new TresEnRayaMisery("Yoshi", 'X', "Isa", 'O');
				partida2.inicio();
				break;
			default:
				System.out.println("Opcion no valida");
			}

		}while (opcion != 0);
		
		sc.close();
	}

}
