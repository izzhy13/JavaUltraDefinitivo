package poo.polimorfismo;

public class Ave {
	protected String nombre;

	public Ave(String nombre) {
		this.nombre = nombre;
	}
	
	public void Volar() {
		System.out.print("Soy " + nombre + " y estoy volando");
	}
}
