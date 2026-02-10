package poo;

import java.util.ArrayList;

public class Materia {
	private String nombre;
	private int codigoMateria;
	
	private ArrayList<Estudiante>estudiantes;

	private static String facultad = "UVA";
	private static int numMatriculas = 0;
	private static int genCodMateria=301;

	public Materia(String nombre) {
		this.nombre = nombre;
		this.codigoMateria=genCodMateria;

		this.estudiantes = new ArrayList<>();
		genCodMateria++;
	}
	
	public void matricularEstudiante (Estudiante estu) {
		estudiantes.add(estu);
		numMatriculas++; //todos los estudiantes*sus asignaturas
	}

	public String getNombre() {
		return nombre;
	}

	public int getCodigoMateria() {
		return codigoMateria;
	}

	public static int getGenCodMateria() {
		return genCodMateria;
	}

	public static String getFacultad() {
		return facultad;
	}

	public static void setFacultad(String facultad) {
		Materia.facultad = facultad;
	}

	public String getEstudiantes() {
		return estudiantes.toString();
	}

	public int numeroEstudiantes () {
		return estudiantes.size();
	}
	
	public static int getNumMatriculas() {
		return numMatriculas;
	}
	
}

