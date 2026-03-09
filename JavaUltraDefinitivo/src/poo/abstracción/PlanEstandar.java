package poo.abstracción;

public class PlanEstandar extends Suscripciones{
	private static final int LIMITE_ESTANDAR = 1;
	
	public PlanEstandar(String nombreUsuario, double precioBase) {
		super(nombreUsuario, precioBase);
	}
	
	@Override
    public int getMaxPerfiles() {
        return LIMITE_ESTANDAR;
    }

	@Override
	protected double calcularPrecio() {
		return getPrecioBase();
	}

}
