package laboratorios;


public class UnidadesEspaciales {
	public static final double GRAVEDAD_TIERRA = 9.81;
	public static final double GRAVEDAD_MARTE = 3.71;
	
	public static double calcularPeso(double masa, double gravedad) {
		if (masa < 0) {
			throw new IllegalArgumentException("La masa no puede ser negativa.");
		}
		return masa * gravedad;
	}
	
	public static double convertirKmAMillas(double kilometros) {
		return kilometros * 0.621371;
	}
	
	public static boolean esVelocidadDeEscape(double velocidad) {
		// Velocidad de escape de la Tierra en km/h aprox 40270
		return velocidad >= 40270;
	}
	
	public static double calcularFuerzaViejo(double m, double a) {
		return m * a;
	}
	
	public static double calcularFuerza(double masa, double aceleracion) {
		if (masa < 0) {
			throw new IllegalArgumentException("La masa no puede ser negativa.");
		}
		return masa * aceleracion;
	}
}
