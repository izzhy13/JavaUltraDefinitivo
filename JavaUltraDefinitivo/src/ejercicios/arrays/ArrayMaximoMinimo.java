package ejercicios.arrays;

public class ArrayMaximoMinimo {

	public static void main(String[] args) {
		int[] arr = {59,52,72,34,222};
		int maximo = arr[0]; 
		int minimo = arr[0]; //no se pone 0 porque sino nos dira que el min sera 0 cuando no esta en el array

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maximo) {
				maximo = arr[i];
			} else if (arr[i] < minimo) {
				minimo = arr[i];
			}

		}
		
		System.out.println("el max es " + maximo + " el min es " + minimo);

	}

}
