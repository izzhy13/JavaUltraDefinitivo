package poo.polimorfismo;

public class Gallo extends Ave{
	private boolean estaAfonico;
	
	public Gallo(String nombre) {
		super(nombre);
		this.estaAfonico = false;
	}
	
	@Override
	public void Volar() {
		super.Volar();
		System.out.println(" pero no muy alto, que soy un gallo");
	}

	public void ponerAfonico () {
		estaAfonico = true;
	}
	
	public void curarAfonia () {
		estaAfonico = false;
	}

	public boolean isEstaAfonico() {
		return estaAfonico;
	}
		
}
