package poo.herencia;

public class Boton extends Componente {
	protected String texto;

	public Boton(int id, String texto) {
		super(id);
		this.texto = texto;
	}

	@Override
	public void renderizar() {
		super.renderizar();
		System.out.println(", con el texto " + texto );
	}
		
}
