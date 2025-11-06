package ejercicios;

public class Del1Al100 { //for dentro de otro for
	public static void main(String[] args) {

		for (int i = 1 ; i <= 10 ; i++ ) { //el bloque de fuera me ve las filas
			for (int j = 1; j<= 10; j++) { //el bloque de dentro me ve las columnas
				System.out.print(" F" + i + "C" + j);
			}
			System.out.println(" ");
		}
		
		System.out.println("\n\n");

		int contador = 1;
		for (int i = 1 ; i <= 10 ; i++ ) { //el bloque de fuera me ve las filas
			for (int j = 1; j<= 10; j++) { //el bloque de dentro me ve las columnas
				System.out.print(contador + " ");
				contador ++;
			}
			System.out.println(" ");
		}

	}
}
