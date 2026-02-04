package poo.app;

import poo.Edificio;

public class AppAscensorEdificio {

	public static void main(String[] args) {
		Edificio torre = new Edificio ("TorreCentral", 10, 0);
		Edificio parking = new Edificio ("ParkingSubterráneo", 0, -3);
		
		torre.ordenarSubida(5);
		torre.ordenarSubida(8);
		torre.ordenarBajada(5);

		parking.ordenarBajada(2);
		parking.ordenarSubida(1);
		parking.ordenarBajada(5);
		
	}

}
