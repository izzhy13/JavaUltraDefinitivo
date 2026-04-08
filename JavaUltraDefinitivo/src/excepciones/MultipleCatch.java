package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		try {
			System.out.println("Dime dos numeros para dividirlos");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("La division es " + num1/num2);

		} catch(ArithmeticException e) {
			System.out.println("No se puede dividir entre cero");
			
		} catch(InputMismatchException e) {
			System.out.println("Eso no es un número entero");
		}
		
		sc.close();
	}
}
