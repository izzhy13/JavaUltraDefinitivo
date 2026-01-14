package poo;

public class Termometro {
	private double temperatura;
	private String tipo;

	public Termometro (double temperatura) {
		setTemperatura(temperatura); //queremos modificar la temperatura bajo nuestras condiciones (las del setter)
	}
	
	public Termometro (double temperatura, String tipo) {
		setTemperatura(temperatura); 
		this.tipo= tipo;
	}

	public double getTemperatura() {
		return temperatura;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTemperatura(double temperatura) {
		if (temperatura >= -273.15) {
			this.temperatura = temperatura;
		}else {
			System.out.println("No es fisicamente posible bajar del cero absoluto");
		}
	}

}
