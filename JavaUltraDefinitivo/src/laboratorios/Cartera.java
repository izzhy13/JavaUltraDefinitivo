package laboratorios;

public class Cartera {
	private String titular;
	private double saldo;
	
	public Cartera (String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public void ingresar (double cantidad) {
		if (cantidad > 0 ) {
			this.saldo += cantidad;
			System.out.println("Ingresado con éxito.");
		}else {
			System.out.println("ERROR: Operación no permitida");
		}
	}

	public void retirar (double cantidad) {

		if (cantidad > 0 && cantidad <= this.saldo) {
			this.saldo -= cantidad;
			System.out.println("Retirada con éxito.");
		} else {
			System.out.println("ERROR: Operación no permitida o saldo insuficiente.");
		}

	}

	public void getSaldo () {
		System.out.println("El saldo de tu cuenta es de " + this.saldo);
	}

}
