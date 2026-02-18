package poo.herencia;

import java.util.Objects;

public class Libro {
	protected String titulo;
	protected int isbn;

	public Libro(String titulo, int isbn) {
		this.titulo = titulo;
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Libro: [" + titulo + "] ISBN: [" + isbn +"]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return isbn == other.isbn;
	}

}
