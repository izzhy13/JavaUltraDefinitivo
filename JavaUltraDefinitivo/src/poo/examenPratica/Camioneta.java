package poo.examenPratica;

public class Camioneta extends Vehiculo {
	
	public Camioneta(String matricula, int horaIngreso) {
		super(matricula, horaIngreso);
	}

	@Override
	public double calcularCoste(int horaSalida) {
		double coste = (horaSalida - getHoraIngreso()) * (getPrecioBase() * 1.2);
		return coste;
	}
}

