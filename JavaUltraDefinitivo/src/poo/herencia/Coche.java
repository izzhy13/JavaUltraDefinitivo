package poo.herencia;

public class Coche extends Vehiculo {
	private int numeroPuertas;

	public Coche (String marca, String modelo, int numeroPuertas) {
		super(marca,modelo);
		this.numeroPuertas = numeroPuertas;
	}

	@Override
	public String toString() {
		return "Soy un " + marca + " " + modelo + " y tengo " + numeroPuertas +  " puertas" ;
	}
	
}
