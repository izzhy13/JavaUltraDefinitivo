package poo.examenPratica;

import java.util.Objects;

public abstract class Recurso {
	private String titulo;
	private boolean disponible;
	
	public Recurso(String titulo) { 
		if (titulo == null || titulo.equals("")) {
			this.titulo = "Sin tiutlo";
		} else {
			this.titulo = titulo;
		}
		this.disponible = true;
	}
	
	public abstract int solicitarPrestamo();

	public boolean isDisponible() {
		return disponible;
	}

	protected void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getTitulo() {
		return titulo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) { //tendremos que sobreescribirlo en las hijas
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recurso other = (Recurso) obj;
		return Objects.equals(titulo, other.titulo);
	}
	
}
