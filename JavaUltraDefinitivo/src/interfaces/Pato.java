package interfaces;

public class Pato extends Animal implements Volador, Nadador{
	
	public Pato(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void zambullirse() {
		System.out.println(getNombre() + " se zambulle");
	}

	@Override
	public void nadar(int metros) {
		System.out.println(getNombre() + " nada estos metros " + metros);
	}

	@Override
	public void salirDelAgua() {
		System.out.println(getNombre() + " salio del agua");
	}

	@Override
	public void despega() {
		System.out.println(getNombre() + " despliega sus alas y volaa");
	}

	@Override
	public void volar(int altitud) {
		System.out.println(getNombre() + " está volando a " + altitud + " metros de altura");
	}

	@Override
	public void aterrizar() {		
		System.out.println(getNombre() + " se posa en el lago");
	}

	@Override
	public void hacerSonido() {
		System.out.println(getNombre() + " cuac cuac!");

	}

}
