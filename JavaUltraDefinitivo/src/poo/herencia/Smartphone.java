package poo.herencia;

public class Smartphone extends Producto {
	private String memoriaRAM;

	public Smartphone(String nombre, float precio, String memoriaRAM) {
		super(nombre, precio);
		this.memoriaRAM = memoriaRAM;
	}

	@Override
	public String toString() {
		return super.toString() + " es un Smartphone con una memoriaRAM de" + memoriaRAM;
	}	
	
}
