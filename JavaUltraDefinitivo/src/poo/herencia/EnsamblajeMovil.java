package poo.herencia;

public class EnsamblajeMovil {
	
	protected final void fabricar() {
		colocarPlaca();
		colocarPantalla();
		empaquetar();
	}
	
	protected void colocarPlaca() {
		System.out.println("Colocando la placa...");
	}
	
	protected void colocarPantalla() {
		System.out.println("Colocando pantalla LCD estándar...");
	}
	
	protected void empaquetar() {
		System.out.println("Empaquetando...");
	}
	
	
}
