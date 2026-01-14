package poo;

public class Superheroe {
	private String nombre;
	private String superpoder;
	private boolean capa;

	public Superheroe (String nombre, String superpoder) {
		this.nombre = nombre;
		this.superpoder = superpoder;
		this.capa = true;
	}

	public void describir () {
		System.out.print("Soy " + this.nombre + " mi poder es " + this.superpoder);
		if (this.capa) {
			System.out.println(" y llevo capa");
		}else {
			System.out.println(" y NO llevo capa");
		}
	}

}
