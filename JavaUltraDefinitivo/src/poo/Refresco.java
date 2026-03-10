package poo;

public final class Refresco extends Bebidas{
	private String tamaño;

	public Refresco(String nombre, double precioBase, String tamaño) {
		super(nombre, precioBase);
		this.tamaño = tamaño;
	}

	@Override
	public double calcularPrecio() {
		double extra = 0;
		
		if (tamaño.equalsIgnoreCase("mediano")) { 
			extra = 1.0;
		} else if (tamaño.equalsIgnoreCase("grande")) {
			extra = 2.0;
		}
		
		return precioBase + extra;
	}
}