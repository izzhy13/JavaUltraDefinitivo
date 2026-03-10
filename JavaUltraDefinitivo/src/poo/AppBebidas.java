package poo;

import java.util.ArrayList;

public class AppBebidas {

	public static void main(String[] args) {

		ArrayList<Bebidas>ListaBebidas = new ArrayList<>();

		Cafe cafe1 = new Cafe("Cafe negro", 1, 1);
		Cafe cafe2 = new Cafe("Cafe con leche", 1, 1);
		Refresco refre1 = new Refresco("Cocacola", 1.5, "Grande");
		Refresco refre2 = new Refresco("Cocacola", 1.2, "Pequeño");
		Bebidas cerveza1 = new BebidaAlcoholica ("Polar", 1.5);

		ListaBebidas.add(cafe1);
		ListaBebidas.add(cafe2);
		ListaBebidas.add(refre1);
		ListaBebidas.add(refre2);
		ListaBebidas.add(cerveza1);

		for(Bebidas b : ListaBebidas) {
			System.out.println(b.toString());
		}

	}
}
