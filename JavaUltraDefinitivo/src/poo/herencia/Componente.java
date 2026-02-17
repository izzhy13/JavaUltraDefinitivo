package poo.herencia;

public class Componente {
	protected int id;

	public Componente(int id) {
		this.id = id;
	}
	
	public void renderizar() {
		System.out.print("Dibujando componente " + id );
	}	
}
