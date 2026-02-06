package poo;

import java.util.ArrayList;

public class Materia {
	private String nombre;
	private ArrayList<Estudiante>estudiantes;

	private static String facultad = "UVA";
	private static int numMatriculas = 0;

	public Materia(String nombre) {
		this.nombre = nombre;
		this.estudiantes = new ArrayList<>();
	}
	
	public void matricularEstudiante (Estudiante estu) {
		estudiantes.add(estu);
		numMatriculas++; //todos los estudiantes*sus asignaturas
	}

	public String getNombre() {
		return nombre;
	}

	public static String getFacultad() {
		return facultad;
	}

	public static void setFacultad(String facultad) {
		Materia.facultad = facultad;
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public static int getNumMatriculas() {
		return numMatriculas;
	}
	
}

