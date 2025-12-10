package ejercicios.arrays;

public class CuadradosCubos {

	public static void main(String[] args) {
		int [][] numeros = new int [5][3]; //5 numeros, cuantas cosas quiero guardar: numero cuadrado y cubo

		System.out.println("Tengo " + numeros.length + " filas y " + numeros[0].length + " columnas");

		for (int i = 0; i < numeros.length; i++) { //la longitud del numero, las filas --< numeros.length
			for (int j = 0; j < numeros[0].length; j++) {
				numeros[i][j] = (int)Math.pow(i+1, j+1); //para no elevar 0 a la 0
				System.out.print(numeros[i][j] + " | ");
			}	
			
			System.out.println("  ");
			
		}

	}
	
}
