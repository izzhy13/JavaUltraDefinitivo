package ejercicios.funcionespredefinidas;

import java.util.Scanner;

import java.util.Scanner;

public class PalabraVertical {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		char caracter;
		System.out.println("Dime una palabra o una frase");
		String cadena = entrada.nextLine();
		
		for (int i=0; i<=cadena.length()-1 ; i++) { //opcion 1: cadena.length()-1 //opcion 2 i<cadena.length()
			caracter = cadena.charAt(i); 
			System.out.println(caracter);
		}//esto me devuelve un caracter (char)

		
		System.out.println();
		
		//con el metodo substring: 
		
		String caracter2;
		
		for (int i=0; i<cadena.length(); i++) { //opcion 1: cadena.length()-1 //opcion 2 i<cadena.length()
			caracter2 = cadena.substring(i,i+1); //si solo pongo i me pone desde el principio hasta el final
			System.out.println(caracter2);
		}//esto me devuelve un string(String)
		
		entrada.close();
		
	}

}
