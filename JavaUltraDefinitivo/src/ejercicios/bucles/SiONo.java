package ejercicios.bucles; //SIN TERMINARRR

import java.util.Scanner;

public class SiONo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String respuesta;
		
		do {	
			System.out.println("Quieres continuar? (s/n) ");
			respuesta = entrada.nextLine();

		} while (respuesta != "s" ); //los datos no primitivos no se pueden comparar con el =
				
		entrada.close();
		
	}
}
