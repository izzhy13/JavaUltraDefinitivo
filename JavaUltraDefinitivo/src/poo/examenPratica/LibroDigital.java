package poo.examenPratica;

import java.util.Objects;

public class LibroDigital extends Recurso{
	private String autor;
	private double tamañoArchivoMB;

	public LibroDigital(String titulo, String autor, double tamañoArchivoMB) {
		super(titulo);
		this.autor = autor;
		this.tamañoArchivoMB = tamañoArchivoMB;
	}

	@Override
	public int solicitarPrestamo() {
		System.out.println("Acceso concedido al libro digital " + getTitulo() + ". Descargando...");
		return 0; 
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), autor);
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		LibroDigital other = (LibroDigital) obj;
		return Objects.equals(autor, other.autor);
	}

}
