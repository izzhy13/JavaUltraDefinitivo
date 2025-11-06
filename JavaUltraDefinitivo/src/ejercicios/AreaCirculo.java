package ejercicios;

import java.util.Scanner;
import java.lang.Math; //para el PI --> Math.PI

public class AreaCirculo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
				
		// PI * (radio ^ 2);
		double area;
		double radio;
		
		System.out.print("Dime el radio del circulo y yo te digo el area");
		radio = entrada.nextDouble();
		
		area = Math.PI * Math.pow(radio,2);
		// = (int) Math.pow(,) te lo guarda como entero, pero pierdas datos
		
		System.out.print("El area es " + area);
		
		entrada.close();
					 
	}

}
