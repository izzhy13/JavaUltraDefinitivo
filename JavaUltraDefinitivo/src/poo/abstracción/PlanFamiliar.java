package poo.abstracción;

public class PlanFamiliar extends Suscripciones {
	private static final int LIMITE_FAMILIAR = 5;
	private static final double PLUS = 0.4;
	
	public PlanFamiliar(String nombreDeUsuario, double precioBase) {
		super(nombreDeUsuario, precioBase);
	}
	
	@Override
	protected double calcularPrecio() {
		return getPrecioBase() * (1+PLUS);
	}

	@Override
	//Posible refactorizacion, subir método al padre, el atributo también e inicializar en el constructor ??
	protected int getMaxPerfiles() {
		return LIMITE_FAMILIAR;
	}
	
}

