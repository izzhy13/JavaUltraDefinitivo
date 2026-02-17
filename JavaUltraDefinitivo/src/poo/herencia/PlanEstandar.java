package poo.herencia;

public class PlanEstandar extends Suscripciones{

	public PlanEstandar(String nombreDeUsuario, int maxPerfiles) {
		super(nombreDeUsuario, 1);
	}

	@Override
	public float precioFinal() {
		return super.precioFinal();
	}

	@Override
	public void añadirPerfil(String nombre) {
		super.añadirPerfil(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + "PlanEstandar []";
	}
	
}
