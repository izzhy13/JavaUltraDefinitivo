package ejercicios.funcionespredefinidas; //SIN TERMINARRR

import java.util.Scanner;

public class SiONo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String respuesta;
		String respuestaCorrecta;
		
		do {	
			System.out.println("Quieres continuar? (s/n) ");
			respuesta = entrada.nextLine(); //toLowerCase o toupperCase
			
			/* System.out.println(" " + respuesta.equalsIgnoreCase("s") + " " + respuesta.equalsIgnoreCase("n"));
			System.out.println(" " + (respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n")));
			System.out.println(" " + !(respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n"))); */
			
		//los datos no primitivos no se pueden comparar con el =
		
		//} while (!(respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n"))); //OPCION 1 con OR
		} while (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n")); //OPCION 2 con AND
		
		System.out.println("Hasta luego un placer");
		entrada.close();
		
	}
}
