package poo.herencia;

public class Repartidor extends Empleado{
	protected String zona;

	public Repartidor(String nombre, String zona) {
		super(nombre);
		this.zona = zona;
	}

	@Override
	public double getSalario() {

		if (zona.equals("Zona 1")) {
			return super.getSalario() + 100;
		}
		return super.getSalario();
	}
}

