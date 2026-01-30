package ejercicios.arrayLists;

import java.util.Scanner;
import java.util.ArrayList;

public class TamanoArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numeritos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		int introducido;
		System.out.println("Introduce numeros");

		do  {

			introducido = sc.nextInt();

			if (introducido == -1) {
				break;
			}

			numeritos.add (introducido);

			// System.out.println(numeritos);

		} while (introducido != -1);

		System.out.println("el primer num es " + numeritos.get(0) + " y el último " + numeritos.get(numeritos.size()-1));

		sc.close();

	}

}
