package poo.examenPratica;

public class Parking {
	private Vehiculo [][] plazas;
	private int filas;
	private int columnas;
	// private int horaSalida -- el parking no tiene hora de salida, es el coche cuando SE VA

	public Parking(int filas, int columnas) {
		this.filas = filas;
		this.columnas = columnas;
		this.plazas = new Vehiculo [filas][columnas];
	}	

	private boolean estaEstacionado (String matricula) {

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (plazas[i][j] != null) {
					if (plazas[i][j].getMatricula().equals(matricula))
						return true;
				}
			}
		}
		return false;
	}

	public boolean estacionar(Vehiculo v) {
		if (estaEstacionado(v.getMatricula())){
			System.out.println("El vehiculo ya esta estacionado");
			return false;
		}

		int limiteFilas = (v instanceof Camioneta) ? 2 : filas;

		for (int i = 0; i < limiteFilas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (plazas[i][j] == null) {
					plazas[i][j] = v;
					return true;
				}
			}
		}

		if (v instanceof Camioneta) {
			System.out.println("Error: La zona de camionetas (filas 0-1) está llena.");
		} else {
			System.out.println("Error: El parking está completamente lleno.");
		}

		return false;
	}

	public boolean sacarVehiculo(String matricula, int horaSalida)  {

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				// 1. Comprobamos primero que NO sea null
				if (plazas[i][j] != null && plazas[i][j].getMatricula().equals(matricula)) {

					Vehiculo v = plazas[i][j];
					double coste = v.calcularCoste(horaSalida);
					System.out.println("Vehículo con matrícula " + matricula + " sale. Coste: " + coste + "€");

					plazas[i][j] = null;
					return true;
				}
			}
		}

		return false;
	}

	public void mostrarParking() {

		System.out.println("--- ESTADO DEL PARKING ---");

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (plazas[i][j] == null) {
					System.out.print("[ ] "); // Plaza vacía
				} else {
					// Sacamos la primera letra del tipo de vehículo (C, M, T...)
					String tipo = plazas[i][j].getClass().getSimpleName().substring(0, 1); 
					// .getClass(): Identifica la clase del objeto .getSimpleName(): Quita el nombre del paquete y deja el de la clase.
					System.out.print("[" + tipo + "] "); 
				}
			}
			System.out.println(); // Salto de línea al terminar cada fila
		}
		System.out.println("--------------------------");
	}

}
