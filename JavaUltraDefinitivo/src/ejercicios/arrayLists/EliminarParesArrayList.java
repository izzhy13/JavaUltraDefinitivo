package ejercicios.arrayLists;

import java.util.ArrayList;

public class EliminarParesArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(4);
		numeros.add(3);
		numeros.add(5);
		numeros.add(6);
			
		//manera 1
		
		for (int i = numeros.size()-1 ; i >= 0 ; i--) {
			if (numeros.get(i) % 2 == 0) {
				numeros.remove(i);       
			}
		} 
		
		//manera 2
		
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) % 2 == 0) {
				numeros.remove(i);  
				//volvemos a mirar, ya que eliminamos ese registro y el Array se comprime
				i--;
			}
		}
		
		//manera 3
		
		numeros.removeIf(par -> par % 2 == 0);
		
		System.out.println(numeros);		
	}

}
