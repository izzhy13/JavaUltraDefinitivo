package poo.examenPratica;

import java.util.ArrayList;

public class AppBiblioteca {

	public static void main(String[] args) {
		ArrayList<Recurso> biblioteca = new ArrayList<>();

		Recurso libro = new LibroFisico("El Quijote", "Cervantes", 800);
		Recurso revista1 = new Revista("Vogue", 124, 5);
		LibroDigital libroDigital = new LibroDigital ("Clean Code", "Robert C. Martin", 12.5);

		biblioteca.add(libro);
		biblioteca.add(revista1);
		biblioteca.add(libroDigital);

		for (Recurso r : biblioteca) {
			r.solicitarPrestamo();
		}
		
		libro.solicitarPrestamo();
		
		Recurso revista2= new Revista("Vogue", 124, 5);

		if (revista1.equals(revista2)) {
		    System.out.println("IDENTIDAD: El sistema reconoce correctamente que son la misma revista.");
		} else {
		    System.out.println("IDENTIDAD: Error, el sistema cree que son distintas.");
		}
	}

}
