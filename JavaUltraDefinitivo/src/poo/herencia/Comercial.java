package poo.herencia;

public class Comercial extends Empleado {
	private int comision;

	public Comercial(String nombre, int salarioBase, int comision) {
		super(nombre, salarioBase);
		this.comision = comision;
	}

	@Override
	public int calcularSalario() {
		return super.calcularSalario() + comision;
	}

}
