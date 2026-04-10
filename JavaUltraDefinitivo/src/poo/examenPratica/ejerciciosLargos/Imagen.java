package poo.examenPratica.ejerciciosLargos;

public abstract class Imagen implements Validable{
	private int width;
	private int heigh;
	
	public Imagen(int width, int heigh) {
		super();
		this.width = width;
		this.heigh = heigh;
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeigh() {
		return heigh;
	}
		
}
