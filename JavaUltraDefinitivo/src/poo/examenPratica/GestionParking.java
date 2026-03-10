package poo.examenPratica;

public class GestionParking {

	public static void main(String[] args) {

		Parking miParking = new Parking(5, 5);

		Vehiculo c1 = new Auto("1234ABC", 10); 
		Vehiculo m1 = new Moto("5555XYZ", 11);
		Vehiculo t1 = new Camioneta("9999CCC", 9);

		miParking.estacionar(c1);
		miParking.estacionar(m1);
		miParking.estacionar(t1);

		miParking.estacionar(t1);

		miParking.mostrarParking();

		miParking.sacarVehiculo("1234ABC", 15);

		miParking.mostrarParking();
	}
}
