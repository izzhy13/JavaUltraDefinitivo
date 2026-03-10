package poo.examenPratica;

public abstract class Producto {
	private String marca;
	private double precio;
	
	public Producto(String marca, double precio) {
		this.marca = marca;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "Producto [marca=" + marca + ", precio=" + precio + "]";
	}
		
}
