package poo.app;

import poo.Estudiante;
import poo.Materia;

import java.util.Scanner;
import java.util.ArrayList;

public class AppGestionMatriculas {

	public static void mostrarEstudiantes(ArrayList<Estudiante> estu) {
		for (Estudiante e : estu) {
			System.out.println(e.getNumMatricula() + "-" + e.getNombre());
		}
	}

	public static void mostrarMaterias(ArrayList<Materia> mat) {

	}
	
	public void añadirMateria(ArrayList<Materia> mat) {

	}
	
	public void añadirEstudiante(String nombre) {

	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Materia> materias = new ArrayList<>();
		ArrayList<Estudiante> estudiantes = new ArrayList<>();

		int opcion;

		do {

			System.out.println("\n\nQue opcion quieres elegir");
			System.out.println("0.Salir");
			System.out.println("1.Añadir materia");
			System.out.println("2.Añadir estudiante");
			System.out.println("3.Mostrar el listado de alumnos");
			System.out.println("4.Mostrar el listado de materias");
			System.out.println("5.Listar los alumnos");
			System.out.println("6.Listar el numero total alumnos");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 0:
				System.out.println("Adios!");
				break;
			case 1 : 
				break;
			case 2 :
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				mostrarEstudiantes(estudiantes);
				break;
			default:
				System.out.println("Opcion no valida");

			}

		}while (opcion != 0);

		Estudiante estu1 = new Estudiante("Isabel");
		System.out.println("me llamo " + estu1.getNombre() + " y mi num de matricula es " + estu1.getNumMatricula());

		Estudiante estu2 = new Estudiante("Hector");
		System.out.println("me llamo " + estu2.getNombre() + " y mi num de matricula es " + estu2.getNumMatricula());

		//puedo hacerlo pero no es recomendable
		System.out.println(estu1.getSiguienteMatricula() + " " + estu2.getSiguienteMatricula());

		//se accede a través de la clase
		System.out.println(Estudiante.getSiguienteMatricula());

	}

}
