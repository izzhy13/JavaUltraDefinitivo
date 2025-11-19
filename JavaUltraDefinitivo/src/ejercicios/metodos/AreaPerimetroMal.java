package ejercicios.metodos;

public class AreaPerimetroMal {
	
	//mal hecho ya que solamente nos los esta enseñando por pantalla, si quieres hacer cualquier otra cosa no funciona
	public static void perimetro(double radio) {
		System.out.print("El perimetro es: " + 2*Math.PI*radio);
	}
	
	public static void area(double radio) {
		System.out.println("El area es: " + Math.PI*radio*radio);
	}

	public static void main(String[] args) {
		double r = 5;
		area(r);
		perimetro(r);
		
	}

}
