package poo.polimorfismo;

public class AppAves {

	public static void main(String[] args) {
		Ave gallina = new Gallina("Lola");
		Ave gallo = new Gallo("Claudio");

		if(gallina instanceof Gallina) {
			((Gallina)gallina).ponerHuevo();
		}

		// si no hago esta comprobacion, obtengo un error en tiempo de ejecución
		if(gallo instanceof Gallina) {
			((Gallina)gallo).ponerHuevo();
		}else {
			gallo.Volar();
		}

	}

}
