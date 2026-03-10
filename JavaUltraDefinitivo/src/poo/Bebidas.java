package poo;

public abstract class Bebidas {
	protected String nombre;
	protected double precioBase;
	
	public Bebidas(String nombre, double precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
	}

	public abstract double calcularPrecio();
	
}
