package poo;

public final class Cafe extends Bebidas{
	private int numComplementos;

	public Cafe(String nombre, double precioBase, int complementos) {
		super(nombre, precioBase);
		this.numComplementos = numComplementos;
	}

	@Override
	public double calcularPrecio() {
		return precioBase + (numComplementos * 0.50);
	}
	
}
