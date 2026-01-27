package poo;

public class Motor {
	private String tipo;
	private int potencia;
	
	public Motor (String tipo, int potencia) {
		this.tipo = tipo;
		this.potencia = potencia;
	}
	
	public String getInfo() {
		return " un motor " + tipo + " y una potencia de " + potencia + " CV!!";
	}
	
}
