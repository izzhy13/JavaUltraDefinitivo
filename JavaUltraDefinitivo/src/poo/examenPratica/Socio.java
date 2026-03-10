package poo.examenPratica;

public abstract class Socio { //no podemos crear un "socio"
	private static final double INSCRIPCION_FIJA = 30; //es igual para todos(static) y no cambia(final)
	protected String nombre;
	protected double cuotaBase;
	private static int numSocios = 0;
	
	public Socio(String nombre, double cuotaBase) {
		this.nombre = nombre;
		this.cuotaBase = cuotaBase;
		numSocios++;
	}

	public abstract double calcularPrecio();
	
	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", cuotaBase=" + cuotaBase + "]";
	}

	public static double getInscripcionFija() {
		return INSCRIPCION_FIJA;
	}

	public static int getNumSocios() {
		return numSocios;
	} 
		
}
