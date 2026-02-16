package ejercicios.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class BuscarContarArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(6);
		numeros.add(7);
		numeros.add(20);
		numeros.add(3);
		numeros.add(80);
		
		// encontrar el mayor y el menor y sumarlos
		int mayor = numeros.get(0);
		int menor = numeros.get(0);
		int suma = 0;
		int mayoresDe10 = 0;
		
		for (int n : numeros) {
			suma += n; //hay que tener cuidado con el continue, por eso la suma va aqui y no al final
			
			if (n > 10) {
				mayoresDe10++;
			}
			
			if ( n < menor) {
				menor = n;
				continue;
			}
			
			if ( n > mayor) {
				mayor = n;
			}
		}
		
		System.out.println("El mayor es " + mayor + " y el menor " + menor);
		System.out.println("Segun Collections el max es " + Collections.max(numeros)
								+ " y el min " +  Collections.min(numeros));
		
		System.out.println("La suma de todos ellos es " + suma);
		System.out.println("Había " + mayoresDe10 + " número(s) mayor que 10");

	}

}
