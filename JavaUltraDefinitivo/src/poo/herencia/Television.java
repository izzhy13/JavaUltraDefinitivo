package poo.herencia;

public class Television extends Producto{
	protected int pulgadas;

	public Television(String nombre, float precio, int pulgadas) {
		super(nombre, precio);
		this.pulgadas = pulgadas;
	}

	@Override
	public String toString() {
		return super.toString() + " es una Television de " + pulgadas + " pulgadas";
	}
		
}
