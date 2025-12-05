package ejercicios.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InvertirArray {

	final static int TAMAÑO  = 5;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[] normal = new String[TAMAÑO];
		String[] invertido = new String[TAMAÑO];

		for (int i = 0; i < TAMAÑO ; i++) {
			System.out.println("Dime caracteres para rellenar el array");
			normal[i] = entrada.nextLine();
		}
		
		System.out.print("El array quedó conformado así:" + Arrays.toString(normal)+ "\n");		
		//de manera facil
		for (int i = 0; i < TAMAÑO ; i++) {
			invertido[i] = normal[TAMAÑO-i-1];
		}
		
		System.out.print("El array invertido quedó conformado así:" + Arrays.toString(invertido)+ "\n");	
		entrada.close();

	}
}
