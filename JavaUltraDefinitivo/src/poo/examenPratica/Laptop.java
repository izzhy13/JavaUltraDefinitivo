package poo.examenPratica;

public class Laptop extends Producto{
	private String procesador;

	public Laptop(String marca, double precio, String procesador) {
		super(marca, precio);
		this.procesador = procesador;
	}

	@Override
	public String toString() {
		return super.toString() + "[procesador=" + procesador;
	}
			
}
