package poo;

public class Lampara {
	private String color;
	private String marca;
	private boolean estaEncendida;


	public Lampara(String color,String marca) {
		this.color = color;
		this.marca = marca;
	}
	
	public Lampara(String color,String marca, boolean estaEncendida) { 
		//llamamos al otro constructor //no recomendable?
		this(color,marca);
		this.estaEncendida = estaEncendida;
	}

	public void datos() {
		System.out.print("La lampara es de color " + color + " de la marca " + marca);

		if (estaEncendida) {
			System.out.println(" y esta encendida");
		}else {
			System.out.println(" y esta apagada");
		}
	}

	public void encender() {
		this.estaEncendida = true;
	}

	public void apagar() {
		this.estaEncendida = false;
	}

}
