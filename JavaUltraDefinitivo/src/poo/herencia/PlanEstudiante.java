package poo.herencia;

public class PlanEstudiante extends Suscripciones{
	private String universidad;

	public PlanEstudiante(String nombreDeUsuario, int maxPerfiles, String universidad) {
		super(nombreDeUsuario, 1);
		this.universidad = universidad;
	}

	@Override
	public float precioFinal() {
		return super.precioFinal() * 0.50f;
	}
	
	@Override
	public void añadirPerfil(String nombre) {
		super.añadirPerfil(nombre);
	}
	
	@Override
	public String toString() {
		return super.toString() + "PlanEstudiante [universidad=" + universidad + "]";
	}
		
}
