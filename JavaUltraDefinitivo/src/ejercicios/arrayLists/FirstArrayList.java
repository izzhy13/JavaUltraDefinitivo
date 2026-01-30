package ejercicios.arrayLists;

import java.util.ArrayList;

public class FirstArrayList {

	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>();
		
		nombres.add("Jorgi");
		nombres.add("Isabel");
		nombres.add("Hector");
		nombres.add("Francis");
		nombres.add("Pachu");
		
		for (int i = 0; i < nombres.size(); i++) {
			System.out.print(nombres.get(i) + " ");
		}
		
		System.out.println("\n-------------------------------------");
		
		for ( String compisPiso : nombres ) {
			System.out.print( compisPiso + " ");
		}
		
	}

}
