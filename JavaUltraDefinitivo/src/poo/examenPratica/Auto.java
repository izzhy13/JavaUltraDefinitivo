package poo.examenPratica;

public class Auto extends Vehiculo{

	public Auto(String matricula, int horaIngreso) {
		super(matricula, horaIngreso);
	}

	@Override
	public double calcularCoste(int horaSalida) {
		double coste = (horaSalida - getHoraIngreso())* getPrecioBase();
		return coste;
	}
	
}
