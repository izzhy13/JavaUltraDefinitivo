package ejercicios.arrays;

public class Diagonal { 

	public static void main(String[] args) {

		final int TAMAÑO  = 5;
		int [][] diagonal = new int [TAMAÑO][TAMAÑO];
		
		//esta crea y muestra a la vez
		for (int i = 0; i < diagonal.length; i++) { 
			for (int j = 0; j < diagonal[0].length; j++) {
				if (i == j) {
					diagonal[i][j]=1;
					System.out.print("1" + " | ");
				}else {
					diagonal[i][j]=0;
					System.out.print("0" + " | ");

				}
			}

			System.out.println("  ");

		}
		
		//esta crea y luego muestra 
		
		/*for(int i=0; i<diagonal.length;i++) {
			for(int j=0; j<diagonal.length;j++) {
				if(j==i) {
					diagonal[i][j]=1;
				}else {
					diagonal[i][j]=0;
				}
			}
		}

		for(int i=0; i<diagonal.length;i++) {
			for(int j=0; j<diagonal[0].length;j++) {
				System.out.print(diagonal[i][j] + " | ");
			}
			System.out.println(" ");
		}*/
	}

}

