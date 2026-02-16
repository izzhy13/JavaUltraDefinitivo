package poo.herencia;

public class Animal {
	protected String nombre;
	
	public Animal (String nombre) {
		this.nombre = nombre;
	}
	
	public void hacerSonido() {
		System.out.println("El animal " + nombre + " emite un sonido");
	}
}
