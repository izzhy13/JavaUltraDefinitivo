package poo.examenPratica;

public class SocioFamiliar extends Socio {
	private int numMiembros;

	public SocioFamiliar(String nombre, double cuotaBase, int numMiembros) {
		super(nombre, cuotaBase);
		this.numMiembros = numMiembros;
	}

	@Override
	public double calcularPrecio() {
		if (numMiembros > 4) {
			return cuotaBase*0.9 + Socio.getInscripcionFija();
		} else {
			return cuotaBase + Socio.getInscripcionFija();
		}
	}

	@Override
	public String toString() {
		return "SocioFamiliar [numMiembros=" + numMiembros + ", nombre=" + nombre + ", cuotaBase=" + cuotaBase + "]";
	}
	
}
