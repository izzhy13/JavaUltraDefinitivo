package poo.examenPratica;

import java.util.Objects;

public class Revista extends Recurso {
	private int nroEdicion;
	private int mesPublicacion;
	private static final int PRESTAMO_REVISTA = 3;

	public Revista(String titulo, int nroEdicion, int mesPublicacion) {
		super(titulo);
		this.nroEdicion = nroEdicion;	
		if (mesPublicacion < 1 || mesPublicacion > 12) {
			System.out.println("Ey, ese mes no existe!");
		} else {
			this.mesPublicacion = mesPublicacion;

		}
	}

	@Override
	public int solicitarPrestamo() {
		if (isDisponible()) {
			System.out.println("Préstamo concedido para: " + getTitulo());
			setDisponible(false);
			return PRESTAMO_REVISTA;
		} else {
			System.out.println("ERROR: La revista " + getTitulo() + " ya esta prestado");
			return 0;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), nroEdicion);
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		Revista other = (Revista) obj;
		return Objects.equals(nroEdicion, other.nroEdicion);
	}

}
