package poo.herencia;

public class PlanEstudiante extends Suscripciones{
	private String universidad;

	public PlanEstudiante(String nombreDeUsuario, float precioBase, String universidad) {
		super(nombreDeUsuario, precioBase);
		this.universidad = universidad;
	}
	
}
