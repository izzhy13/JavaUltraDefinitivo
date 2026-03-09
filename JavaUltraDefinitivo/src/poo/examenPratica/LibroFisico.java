package poo.examenPratica;

import java.util.Objects;

public class LibroFisico extends Recurso {
	private String autor;
	private int numPaginas;
	private static final int PRESTAMO_LIBRO = 15;

	public LibroFisico(String titulo, String autor, int numPaginas) {
		super(titulo);
		this.autor = autor;
		if (numPaginas < 0) {
			System.out.println("Ey, las paginas no pueden ser negatuvas!!");
		} else {
			this.numPaginas = numPaginas;
		}
	}

	@Override
	public int solicitarPrestamo() {
		if (isDisponible()) {
			System.out.println("Préstamo concedido para: " + getTitulo());
			setDisponible(false);
			return PRESTAMO_LIBRO;
		} else {
			System.out.println("ERROR: El libro " + getTitulo() + " ya esta prestado");
			return 0;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), autor);
	}

	@Override
	public boolean equals(Object obj) {
		// 1. Llamamos a la madre. Si los títulos no coinciden o la clase es distinta, super dirá false.
		if (!super.equals(obj))
			return false;
		// 2. Si llegamos aquí, sabemos que el título es igual y que 'obj' es un LibroFisico.
		LibroFisico other = (LibroFisico) obj;
		return Objects.equals(autor, other.autor);
	}

}
