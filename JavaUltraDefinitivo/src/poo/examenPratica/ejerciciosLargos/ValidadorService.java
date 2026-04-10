package poo.examenPratica.ejerciciosLargos;

import poo.examenPratica.Recurso;

public class ValidadorService {
	private Validable[] ficheros; //no se puede cerar un objeto del tipo validable pero si un array de cosas validables
	// es por el polimorfismo

	public ValidadorService(Validable[] ficheros) {
		this.ficheros = ficheros;
	}

	public boolean validarTodo() {
		for (Validable v : ficheros) {
			if (!v.isValid()) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean validarFichero(Validable fichero) {
        return fichero.isValid();
	}
}
