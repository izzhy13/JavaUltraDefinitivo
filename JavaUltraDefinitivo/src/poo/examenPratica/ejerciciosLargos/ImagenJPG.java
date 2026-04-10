package poo.examenPratica.ejerciciosLargos;

public class ImagenJPG extends Imagen{

	public ImagenJPG(int width, int heigh) {
		super(width, heigh);
	}

	@Override
	public boolean isValid() {
		if (getWidth() * getHeigh() < 5000000) {
			return true;
		}
		return false;
	}

}
