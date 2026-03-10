package poo.examenPratica;

public class Smartphone extends Producto{
	private int almacenamiento ;

	public Smartphone(String marca, double precio, int almacenamiento) {
		super(marca, precio);
		this.almacenamiento = almacenamiento;
	}
	
	@Override
	public String toString() {
		return super.toString() + "[almacenamiento=" + almacenamiento;
	}
	
}
