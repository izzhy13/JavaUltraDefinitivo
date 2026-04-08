package interfaces;

public class Avion implements Volador{
	private String numBastidor;
	
	public Avion(String numBastidor) {
		this.numBastidor = numBastidor;
	}

	@Override
	public void despega() {
		System.out.println("El avion " + numBastidor + " despegando por la pista 5 estrepitosamente");
	}

	@Override
	public void volar(int altitud) {
		System.out.println("El avion " + numBastidor + " volando a " + altitud + " metros de altura");
	}

	@Override
	public void aterrizar() {
		System.out.println("El avion " + numBastidor + " aterrizando en la pista 5");
	}
	
}
