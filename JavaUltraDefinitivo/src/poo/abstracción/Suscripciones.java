package poo.abstracción;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Suscripciones { //nadie va a crear una suscripcion que no sea de un plan
	private String nombreDeUsuario;
	private final double precioBase;
	private ArrayList<Perfil> perfiles = new ArrayList<>();

	public Suscripciones(String nombreDeUsuario, double precioBase) {
		this.nombreDeUsuario = nombreDeUsuario;

		if (precioBase < 0) {
			//Si intentan engañarnos que paguen!!
			this.precioBase=100;
		}else {
			this.precioBase=precioBase;	
		}
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getNombreUsuario() {
		return nombreDeUsuario;
	}

	protected abstract double calcularPrecio();

	protected abstract int getMaxPerfiles();

	protected void anadirPerfil(Perfil p) {
		if (getPerfiles().size() >= getMaxPerfiles()) {
			System.out.print("Tu lista está llena, no puedes añadir más perfiles");
		} else {
			getPerfiles().add(p);
		}

	}

	protected ArrayList<Perfil> getPerfiles() {
		return perfiles;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreDeUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Suscripciones))
			return false;
		Suscripciones other = (Suscripciones) obj;
		return Objects.equals(nombreDeUsuario, other.nombreDeUsuario);
	}

}
