package ejercicios.arrays;

public class CuadradosCubos {

	public static void main(String[] args) {
		int [][] numeros = new int [5][3]; //5 numeros, cuantas cosas quiero guardar: numero cuadrado y cubo
		
		System.out.println("Tengo " + numeros.length + " filas y " + numeros[0].length + " columnas");
		
		for (int i = 0; i < numeros.length; i++) { //la longitud del numero, las filas --< numeros.length
				numeros[i][0] = i;
				numeros[i][1] = Math.powExact(i, 2);
				numeros[i][2] = Math.powExact(i, 3);
		}
		
	}

}
