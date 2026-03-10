package poo.examenPratica;

public class Moto extends Vehiculo {

	public Moto(String matricula, int horaIngreso) {
		super(matricula, horaIngreso);
	}

	@Override
	public double calcularCoste(int horaSalida) {
		double coste = (horaSalida - getHoraIngreso()) * (getPrecioBase() * 0.7);
		return coste;
	}
}
