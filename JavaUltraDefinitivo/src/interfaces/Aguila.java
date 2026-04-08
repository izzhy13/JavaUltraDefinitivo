package interfaces;

public class Aguila extends Animal implements Volador{

	public Aguila(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void hacerSonido() {
		System.out.println(getNombre() + " cocooo!");
	}

	@Override
	public void despega() {
		System.out.println(getNombre() + " despliega sus alas y despega");
	}

	@Override
	public void volar(int altitud) {
		System.out.println(getNombre() + " está volando a " + altitud + " metros de altura");
	}

	@Override
	public void aterrizar() {		
		System.out.println(getNombre() + " se posa en una rama");
	}

}