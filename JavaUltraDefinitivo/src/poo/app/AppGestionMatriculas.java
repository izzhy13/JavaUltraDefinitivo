package poo.app;

import poo.Estudiante;
import poo.Materia;

import java.util.Scanner;
import java.util.ArrayList;

public class AppGestionMatriculas {
	//codigo mejorable, me puedo matricular en una matricula varias veces, hay que confiar en el usuaurio...

	private static Scanner sc= new Scanner(System.in);
	private static ArrayList<Materia> materias = new ArrayList<>();
	private static ArrayList<Estudiante> estudiantes = new ArrayList<>();

	public static void añadirMateria() {
		System.out.println("¿Como se llama la materia?");
		String nombre = sc.nextLine();

		Materia nuevaMateria = new Materia(nombre);
		materias.add(nuevaMateria);
	}

	public static void añadirEstudiante() {
		System.out.println("Como se llama el estudiante?");
		String nombre = sc.nextLine();

		Estudiante nuevoEstudiante = new Estudiante(nombre);
		estudiantes.add(nuevoEstudiante);
	}

	public static void matricularEstudianteAMateria () {
		System.out.println("Elige el código del estudiante:");
		mostrarEstudiantes();
		int codEstudiante = sc.nextInt();
		Estudiante estudiante = null; 

		System.out.println("Elige el código de la materia:");
		mostrarMaterias();
		int codMateria = sc.nextInt();
		Materia materia = null;

		//limpiams el buffer, para cuando leamos un String
		sc.nextLine();

		/*boolean matEncontrada;

	    //vamos a ver si esta la materia
	    for (Materia m : mat) {
	    	if (mat.contains(nombreMat)) {
	    		matEncontrada = true;
				break;
			}
		}
		 */

		//buscamos el estudiante
		for (Estudiante e : estudiantes) {
			if (e.getNumMatricula() == codEstudiante) {
				//aqui no creamos una copia del objeto, estamos copiando la referencia
				//por eso modifico el array
				estudiante = e;
				break;
			}
		}

		//buscamos la materia
		for (Materia m : materias) {
			if (m.getCodigoMateria() == codMateria) {
				//aqui no creamos una copia del objeto, estamos copiando la referencia
				//por eso modifico el array
				materia = m;
				break;
			}
		}

		if (estudiante != null && materia != null) {
			materia.matricularEstudiante(estudiante);
			System.out.println("Matriculado!!");
		}

	}

	public static void mostrarMaterias() {
		for (Materia m : materias) {
			System.out.println(m.getNombre() + "-" + m.getCodigoMateria());
		}
	}

	public static void mostrarEstudiantes() {
		for (Estudiante e : estudiantes) {
			System.out.println(e.getNumMatricula() + "-" + e.getNombre());
		}
	}

	public static void mostrarTotalMatriculados() {
		System.out.println("En total hay " + Materia.getNumMatriculas());
	}

	public static void mostrarMatriculadosEnMateria() {
		System.out.println("Elige el código de la materia:");
		mostrarMaterias();
		int codMateria = sc.nextInt();

		for (Materia m : materias) {
			if (m.getCodigoMateria() == codMateria) {
				System.out.println("Son: " + m.getEstudiantes());
				System.out.println("En total son: " + m.numeroEstudiantes());
			}
		}
	}

	public static void main(String[] args) {

		int opcion;

		do {

			System.out.println("--------------------------------------------");
			System.out.println("Que opcion quieres elegir");
			System.out.println("0.Salir");
			System.out.println("1.Añadir una materia");
			System.out.println("2.Añadir un estudiante");
			System.out.println("3.Matricular a un estudiante a una materia");
			System.out.println("4-Listar las materias");
			System.out.println("5.Listar los estudiantes");
			System.out.println("6.Ver el número total de matriculados");
			System.out.println("7.Ver el número total de matriculados en x materia");
			System.out.println("--------------------------------------------");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 0:
				System.out.println("Adios!");
				break;
			case 1 : 
				añadirMateria();
				break;
			case 2 :
				añadirEstudiante();
				break;
			case 3:
				matricularEstudianteAMateria();
				break;
			case 4:
				mostrarMaterias();
				break;
			case 5:
				mostrarEstudiantes();
				break;
			case 6:
				mostrarTotalMatriculados();
				break;
			case 7:
				mostrarMatriculadosEnMateria();
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
		
		sc.close();
	}

}
