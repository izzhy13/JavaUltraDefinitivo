package poo.abstracción;

public class PlanEstudiante extends Suscripciones{
	private static final int LIMITE_ESTUDIANTE = 1;
	private static final double DESCUENTO = 0.5;
	private String universidad;

	public PlanEstudiante(String nombreDeUsuario, double precioBase, String universidad) {
		super(nombreDeUsuario, precioBase);
		this.universidad = universidad;
	}

	@Override
	protected double calcularPrecio() {
		return getPrecioBase() * DESCUENTO;
	}

	@Override
	protected int getMaxPerfiles() {
		return LIMITE_ESTUDIANTE;
	}

}
