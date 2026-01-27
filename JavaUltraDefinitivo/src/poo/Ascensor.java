package poo;

public class Ascensor {
	private int capacidad;
	private int pesoMaximo;
	private int pisoActual;
	private boolean espejo;
	
	public Ascensor(int capacidad, int pesoMaximo, boolean espejo, int pisoActual) {
		this.capacidad = capacidad;
		this.pesoMaximo = pesoMaximo;
		this.espejo = espejo;
		this.pisoActual = 0;
	}
	
	public Ascensor() {
		this.capacidad = 5;
		this.pesoMaximo = 400;
		this.espejo = true;
		this.pisoActual = 0;
	}
	
	public void subir(int n) {
		this.pisoActual += n;
		System.out.println("Subiendo " + n + " plantas");
		System.out.println("Estas en la planta " + this.pisoActual);
	}
	
	public void bajar(int n) {
		this.pisoActual -= n;
		System.out.println("Bajando " + n + " plantas");
		System.out.println("Estas en la planta " + this.pisoActual);
	}
	
	public int getPisoActual () {
		return pisoActual;
	}
	
}
