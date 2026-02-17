package poo.herencia;

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

	//NO ENTIENDO ESTO
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

}
