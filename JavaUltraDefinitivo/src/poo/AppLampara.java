package poo;

public class AppLampara {

	public static void main(String[] args) {
			
		Lampara lamparaIkea = new Lampara ("Blanco", "IKEA");
		Lampara lamparaPhillips = new Lampara ("Rojo", "Phillips");
		
		lamparaIkea.datos();
		
		lamparaPhillips.encender();
		lamparaPhillips.datos();
		
		lamparaPhillips.apagar();
		lamparaPhillips.datos();
				
	}

}
