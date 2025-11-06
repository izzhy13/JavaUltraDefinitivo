package ejercicios;

import java.util.Scanner;

public class ConvertirUnidades {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double velocidad, conversion;
		String opcion;
		
		System.out.print("Dime el numero que quieres convertir");
		velocidad = entrada.nextDouble();
		entrada.nextLine(); /* si leemos un double y luego un string, hay que poner esto ya que se guarda un intro 
		en el buffer de entrada; esta bien de vez en cuando limpiar el buffer */
		
		System.out.println("elige la opcion a la que lo quieres convertir");
		System.out.println("A --> Km/h");
		System.out.println("B --> m/s");
		opcion = entrada.nextLine();
		
		entrada.close();

		
		switch (opcion) {
		case "A", "a": 
			conversion = velocidad*1000/3600;
			System.out.print(velocidad + " Km/h son " + conversion + " m/s");
			break;
		case "B", "b" :
			conversion = velocidad*3600/1000;
			System.out.print(velocidad + " m/s son " + conversion + " Km/h");
			break;
		default:
			System.out.print("Opcion no valida");
					
		}
				
	}

}
