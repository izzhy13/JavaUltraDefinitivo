package poo.examenPratica;

public final class SocioIndividual extends Socio{
	private int diasSemana;

	public SocioIndividual(String nombre, double cuotaBase, int diasSemana) {
		super(nombre, cuotaBase);
		this.diasSemana = diasSemana;
	}

	@Override
	public double calcularPrecio() {
		return cuotaBase + (diasSemana*10) + Socio.getInscripcionFija();
	}

	@Override
	public String toString() {
		return "SocioIndividual [diasSemana=" + diasSemana + ", nombre=" + nombre + ", cuotaBase=" + cuotaBase + "]";
	}
	
}
