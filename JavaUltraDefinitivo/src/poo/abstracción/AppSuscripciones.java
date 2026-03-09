package poo.abstracción;

public class AppSuscripciones {

	public static void main(String[] args) {
		PlanFamiliar fam = new PlanFamiliar("Garcia_Family", 20.0);
		System.out.println("--- Creada suscripción Familiar para Garcia_Family ---");

		System.out.println("\nIntentando añadir 6 perfiles:");
		for (int i = 1; i <= 6; i++) {
			System.out.println("Añadiendo perfil " + i );
			fam.anadirPerfil(new Perfil("Nombre" + i, 10 + i)); 
		}
		
	}  
}
