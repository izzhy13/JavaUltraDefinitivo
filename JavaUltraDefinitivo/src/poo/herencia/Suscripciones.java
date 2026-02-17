package poo.herencia;

public class Suscripciones {
	private String nombreDeUsuario;
	private int maxPerfiles; // Este valor lo llenará cada hija
	private int numPerfiles;
	private float precioBase;
	
	public Suscripciones(String nombreDeUsuario, int maxPerfiles) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.maxPerfiles = 0;
        this.numPerfiles = 0;
        this.precioBase = (precioBase > 0) ? 15.99f : 0; //me va a dar error porque no tiene con que comparar
    }
	
	public void añadirPerfil(String nombre) {
        if (numPerfiles < maxPerfiles) {
            numPerfiles++;
            System.out.println("Perfil '" + nombre + "' añadido.");
        } else {
            System.out.println("Error: Límite de " + maxPerfiles + " superado.");
        }
    }
	
	public float precioFinal() {
		return getPrecioBase();
	}
	
	public int getNumPerfiles() {
	    return numPerfiles;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}

	@Override
	public String toString() {
		return "Suscripciones [nombreDeUsuario=" + nombreDeUsuario + ", maxPerfiles=" + maxPerfiles + ", numPerfiles="
				+ numPerfiles + ", precioBase=" + precioBase + "]";
	}	
				
}
