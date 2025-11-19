package ejercicios.metodos;

import java.util.Scanner;

public class ValidarLetrasDNI {
	final static String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

	public static boolean dniValido(String dni) { //esto se llama igual que el otro dni pero no es igual

		//asumimos que los 8 primeros son numeros y el ultimo una letra
		String dniSinLetra;
		dniSinLetra = dni.substring(0,8);
		char letra = dni.charAt(dni.length()-1);
		int dniNumerico = Integer.valueOf(dniSinLetra);

		char letraBuena;
		//LETRAS.charAt(dniNumerico % 23); queremos el caracter de las letras que estan en esa posicion MANERA PRO
		int resto = dniNumerico % 23;
		letraBuena = LETRAS.charAt(resto);
		//System.out.println("El resto da: " + resto + " y la letra buena sería " + letraBuena);

		if( letra == letraBuena ) {
			return true;
		}else {
			return false; 
		}
	} 

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe tu DNI: ");
		String dni = entrada.nextLine();

		if (dniValido(dni.toUpperCase())) {
			System.out.println("La letra es correcta");
		}else {
			System.out.println("La letra NO es correcta");
		}

		entrada.close();

	}
}
