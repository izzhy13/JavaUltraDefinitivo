package poo;

public class Materia {
	private String nombre;

	private static String nombreFacultad = "UVA";

	public Materia(String nombre) {
		this.nombre = nombre;
		
	}

	public String getNombre() {
		return nombre;
	}
	
	public static String getNombreFacultad() {
		return nombreFacultad;
	}

	public static void setNombreFacultad(String nombreFacultad) {
		Materia.nombreFacultad = nombreFacultad;
	}
	
}
