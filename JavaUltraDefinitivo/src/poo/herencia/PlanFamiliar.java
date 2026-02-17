package poo.herencia;

public class PlanFamiliar extends Suscripciones {
	
	public PlanFamiliar(String nombreDeUsuario, int maxPerfiles) {
		super(nombreDeUsuario, 5);
	}

	@Override
	public float precioFinal() {
		return super.precioFinal() * 1.40f;
	}

	@Override
	public void añadirPerfil(String nombre) {
		super.añadirPerfil(nombre);
	}
	
	@Override
	public String toString() {
		return super.toString() + "PlanFamiliar []";
	}

}

