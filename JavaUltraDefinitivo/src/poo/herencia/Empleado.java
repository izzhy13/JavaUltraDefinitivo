package poo.herencia;

public class Empleado {
	protected String nombre;
	private int salarioBase;
	
	public Empleado (String nombre, int salarioBase) {
		this.nombre = nombre;
		this.salarioBase = salarioBase; 
	}

	public int calcularSalario() {
		return salarioBase;
	}
		
}
