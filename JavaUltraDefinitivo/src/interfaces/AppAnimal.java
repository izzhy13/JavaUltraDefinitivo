package interfaces;

public class AppAnimal {

	public static void main(String[] args) {
		Animal a = new Perro("Sidi", 5);
		Animal b = new Aguila("Fenix", 23);
		
		// Volador v = new Volador() -- esto no se puede
		
		a.hacerSonido();
		a.respirar();
		b.hacerSonido();
		b.respirar();
		
		Avion av = new Avion("RF4452");
		
		ejecutarVuelo((Aguila)b,30);
		ejecutarVuelo(av,1500);
		
		Animal cua1 = new Pato("Miguelito", 19);
		Pato cua2 = new Pato ("Pate", 3);
		Volador patoVolador = new Pato("Donald",135);
		Nadador patoNadador = new Pato("Lucas",30);
		
		// en funcion de como lo definamos vamos a poder usar unos metodos u otros
		
		ejecutarNado((Pato)cua1,50);
		ejecutarNado(cua2,25);
		ejecutarNado(patoNadador,85);
		//el volador no puede nadar xd

	}

	public static void ejecutarVuelo(Volador v, int metros) {
		System.out.println("Iniciando el vuelo");
		v.despega();
		v.volar(metros);
		v.aterrizar();
		System.out.println("Fin del vuelo");
	}
	
	public static void ejecutarNado(Nadador n, int metros) {
		System.out.println("Iniciando el curso de natación");
		n.zambullirse();
		n.nadar(metros);
		n.salirDelAgua();
		System.out.println("A por la toalla!");
	}
	
}
