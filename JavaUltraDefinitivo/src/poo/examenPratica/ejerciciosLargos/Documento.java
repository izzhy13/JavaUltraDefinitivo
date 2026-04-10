package poo.examenPratica.ejerciciosLargos;

public abstract class Documento implements Validable{ //como es abstracta no hay que poner el isValid, ya que lo haran los hijos
	//a los hijos no hay que ponerles el implements porque lo heredan del padre
	private long size;

	public Documento(long size) {
		this.size = size;
	}

	public long getSize() {
		return size;
	}
	
}
