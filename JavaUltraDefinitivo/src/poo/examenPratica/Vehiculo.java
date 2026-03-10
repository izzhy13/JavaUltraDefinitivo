package poo.examenPratica;

import java.util.Objects;

public abstract class Vehiculo {
	private String matricula;
	private int horaIngreso;
	private double precioBase = 5.0;

	public Vehiculo(String matricula, int horaIngreso) {
		this.matricula = matricula;
		this.horaIngreso = horaIngreso;
	}

	public abstract double calcularCoste(int horaSalida);

	public String getMatricula() {
		return matricula;
	}

	public int getHoraIngreso() {
		return horaIngreso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		// Comprobamos si el objeto es "algún tipo" de Vehiculo
		if (!(obj instanceof Vehiculo)) 
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(matricula, other.matricula);
	}

}
