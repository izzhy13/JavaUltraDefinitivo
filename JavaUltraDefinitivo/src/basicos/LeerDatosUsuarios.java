package basicos;

import java.util.Scanner;
public class LeerDatosUsuarios {

	public static void main(String[] args) {
      
		// Creamos el Scanner
        Scanner entrada = new Scanner(System.in);
 
        System.out.print("Introduce tu nombre: ");
        
        // Leemos una línea de texto entera y la guardamos en una variable de tipo String
        String nombre = entrada.nextLine();
 
        System.out.print("Introduce tu edad: ");
        
        // Leemos un número entero
        int edad = entrada.nextInt();
 
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
 
        // Cerramos el Scanner al final
        entrada.close();
        
	}

}
