package ejercicios.funcionespredefinidas;

import java.util.Scanner;

public class MuestraIniciales {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//MANERA EDUARDO
		int posicionApellido;
		
		System.out.println("Dime tus nombre y apellido");
		String nombreApellido = entrada.nextLine().toUpperCase();
		
		posicionApellido = nombreApellido.indexOf(" ")+ 1;
		System.out.println(nombreApellido.charAt(0) + "." + nombreApellido.charAt(posicionApellido));
		
		
		/* MANERA ISABEL
		System.out.println("Dime tus nombre y apellido");
        String nombreApellido = entrada.nextLine();
        
		String nombreApellidoMayus = nombreApellido.toUpperCase();
		int posicionApellido = nombreApellidoMayus.indexOf(" ") + 1; 
		String apellido = nombreApellidoMayus.substring(posicionApellido); //el substring me pone lo que hay despues
		
		char letraNombre = nombreApellidoMayus.charAt(0);
		char letraApellido = apellido.charAt(0);
		
		System.out.println(nombreApellido);
		System.out.println(nombreApellidoMayus);
		System.out.println(letraNombre + "." + letraApellido);
		*/
		
		entrada.close();
		
	}

}



