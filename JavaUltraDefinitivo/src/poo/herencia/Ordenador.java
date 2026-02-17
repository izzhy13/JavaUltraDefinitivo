package poo.herencia;

public class Ordenador extends Dispositivo{
	protected int memoriaRAM;

	public Ordenador(String marca, String modelo, int memoriaRAM) {
		super(marca, modelo);
		this.memoriaRAM = memoriaRAM;
	}
	
	public void iniciarSistema () {
		System.out.println("Cargando sistema operativo..");
	}

	@Override
	public void testear() {
		super.testear();
		System.out.print("Chequeando memoria RAM...");
	}
	
}
