package excepciones;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Dime dos numeros para dividirlos");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		try {
			System.out.println("La division es " + num1/num2);
		} catch(ArithmeticException e) {
			System.out.println("No se puede dividir entre cero");
		}

		//esto en vd no se usa, lo que se hace es

		if (num2!=0) {
			System.out.println("La division es " + num1/num2);
		} else {
			System.out.println("No se puede dividir entre cero");
		}

		sc.close();

	}

}
