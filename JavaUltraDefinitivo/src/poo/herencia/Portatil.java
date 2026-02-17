package poo.herencia;

public class Portatil extends Ordenador{
	protected int nivelBateria;
	protected boolean estaPlegada;
	
	public Portatil(String marca, String modelo, int memoriaRAM, int nivelBateria, boolean estaPlegada) {
		super(marca, modelo, memoriaRAM);
		this.nivelBateria = nivelBateria;
		this.estaPlegada = estaPlegada;
	}

	@Override
	public void testear() {
		super.testear();
		System.out.println("Chequeando estado de la batería...");
	}

	@Override
	public String toString() {
	    return super.toString() + " | Portatil [nivelBateria=" + nivelBateria + ", estaPlegada=" + estaPlegada + "]";
	}

}
