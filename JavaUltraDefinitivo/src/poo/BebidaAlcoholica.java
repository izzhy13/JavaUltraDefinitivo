package poo;

public final class BebidaAlcoholica extends Bebidas{

	public BebidaAlcoholica(String nombre, double precioBase) {
		super(nombre, precioBase);
	}

	@Override
	public double calcularPrecio() {
		return precioBase * 1.15 ;
	}
	
}
