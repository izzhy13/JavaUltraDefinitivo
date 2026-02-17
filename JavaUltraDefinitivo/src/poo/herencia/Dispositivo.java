package poo.herencia;

public class Dispositivo {
	protected String marca;
	protected String modelo;
	
	public Dispositivo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public void testear() {
		System.out.print("Chequeando hardware básico...");
	}  
	
	@Override
	public String toString() {
		return "Dispositivo [marca=" + marca + ", modelo=" + modelo + "]";
	}
		
}
