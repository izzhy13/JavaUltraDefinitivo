package poo.herencia;

public class Producto {
	protected String nombre;
	protected float precio;
	
	public Producto(String nombre, float precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "El producto con nombre " + nombre + ", y precio " + precio;
	}
	
}
