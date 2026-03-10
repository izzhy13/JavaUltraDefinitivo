package poo.examenPratica;

import java.util.ArrayList;

public class Gimnasio {
	private ArrayList <Socio> socios = new ArrayList<>();

	public void darAlta(Socio s) {
		socios.add(s);

		System.out.println("Alta confirmada: " + s.nombre);
		System.out.println("Socios totales en el club: " + Socio.getNumSocios());
	}

	public void avisarRevisionMedica() {
		System.out.println("--- LISTA DE REVISIÓN MÉDICA ---");
		for (Socio s : socios) {
			if (s instanceof SocioIndividual) {
				System.out.println("Avisar a: " + s.nombre);
			}
		}
	}

	public void mostrarCuotasAltas() {
		for (Socio s : socios) {
			if (s.calcularPrecio() > 100) {
				System.out.println(s.toString() + " | Precio: " + s.calcularPrecio() + "€");
			}
		}
	}

}
