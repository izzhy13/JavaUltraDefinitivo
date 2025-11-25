package ejercicios.metodos;

import java.util.Scanner;

public class CambiarLetras {

	//metodo un poco cutre que solo hace una cosa ya que tienen que ser lo mas genericos posibles
	public static String cambiaA (String f) {
		//codigo con String Builder
		StringBuilder aux = new StringBuilder(); //lo crea vacio

		for (int i = 0; i <= f.length()-1; i++) { // 0 porque los strings empiezan por 0
			//System.out.println(f.charAt(i));

			if (f.charAt(i) == 'a' || f.charAt(i) == 'A') {
				aux.append('4');
			}else {
				aux.append(f.charAt(i));
			}
		} 

		return aux.toString();
	}

	public static String replaceMejorado (String f, char viejo, char nuevo) {
		StringBuilder aux = new StringBuilder(); 

		for (int i = 0; i <= f.length()-1; i++) { // 0 porque los strings empiezan por 0

			if (f.charAt(i) == Character.toLowerCase(viejo) || f.charAt(i) == Character.toUpperCase(viejo)) {
				aux.append(nuevo);
			}else {
				aux.append(f.charAt(i));
			}
		} 

		return aux.toString();
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una frase");
		String frase = sc.nextLine();

		String fraseSinA = frase.replace('a', '4');
		System.out.println("La frase modificada es " + fraseSinA);

		String fraseSinAEnMetodo = cambiaA(frase);
		System.out.println("La frase modificada es " + fraseSinAEnMetodo);
		//-------------------------------------------------------------------------
		String fraseSinE = frase.replace('e','3');
		System.out.println("La frase modificada es " + fraseSinE);

		String fraseSinEEnMetodo = replaceMejorado(frase, 'e', '3');
		System.out.println("La frase modificada es " + fraseSinEEnMetodo);

		sc.close();
	}

}
