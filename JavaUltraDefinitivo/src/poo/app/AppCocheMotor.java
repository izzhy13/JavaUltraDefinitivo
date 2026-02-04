package poo.app;

import poo.Coche;

public class AppCocheMotor {
	public static void main(String[] args) {

		Coche coche1 = new Coche ("Lambo", "Diablo", "gasolina", 1000);
		Coche coche2 = new Coche ("BMW", "E36", "cachau", 450);
		
		coche1.getInfo();
		coche2.getInfo();
		
	}
}
