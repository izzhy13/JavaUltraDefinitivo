package ejercicios.arrays;

public class SumarArray {

	public static void main(String[] args) {

		//int[] arr = new int[5]; 

		//como lo vamos a inicializar directamente
		int[] arr = {1,2,3,4,5};
		int suma = 0;

		for (int i = 0; i < arr.length; i++) {
			//la variable del bucle me indica una psoicion del array, tengo que acceder al contenido 
			//System.out.println("vamos a sumar " + arr[i] + " + " + suma);
			suma += arr[i]; 
		}

		System.out.println("La suma da: " + suma);
		
	}
}
