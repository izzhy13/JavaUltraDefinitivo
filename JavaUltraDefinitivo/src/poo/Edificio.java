package poo;

public class Edificio {
	private String nombre;
	private int pisoMaximo;
	private int pisoMinimo;
	private Ascensor ascensor;

	public Edificio (String nombre, int pisoMax, int pisoMin) {
		this.nombre = nombre;
		this.pisoMaximo = pisoMax;
		this.pisoMinimo = pisoMin;

		ascensor = new Ascensor();
	}

	public void ordenarSubida (int cuantosSubimos) {
		if (this.ascensor.getPisoActual() + cuantosSubimos <= pisoMaximo) {
			ascensor.subir(cuantosSubimos);
		}else {
			System.out.println("ERROR: No se puede subir tanto, chocaríamos con el tejado");
		}
	}

	public void ordenarBajada (int cuantosBajamos) {
		if (this.ascensor.getPisoActual() - cuantosBajamos >= pisoMinimo) {
			ascensor.bajar(cuantosBajamos);
		}else {
			System.out.println("ERROR: No hay tantos sótanos en este edificio");
		}
	}

}
