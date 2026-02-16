package poo.herencia;

public class Repartidor extends Empleado{
	protected String zona;

	public Repartidor(String nombre, int salarioBase, String zona) {
		super(nombre, salarioBase);
		this.zona = zona;
	}

	@Override
	public int calcularSalario() {
		int salario = super.calcularSalario();

		if (zona.equals("Zona 1")) {
			salario+= 100;
		}
		return salario;
	}
}

