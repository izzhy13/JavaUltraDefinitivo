package poo.herencia;

public class Personaje {
	protected int salud;

	public Personaje(int salud) {
		this.salud = salud;
	}
	
	public void recibirDanio(int cantidad) {
		salud -= cantidad;
	}	
		
}
