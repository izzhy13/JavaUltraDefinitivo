package poo.herencia;

public class AppEnsamblaje {

	public static void main(String[] args) {
		EnsamblajeMovil ensamblajeMovil = new EnsamblajeMovil();
		EnsamblajePremium ensamblajePremium = new EnsamblajePremium();
		
		ensamblajeMovil.fabricar();
		ensamblajePremium.fabricar();
		
	}

}
