package laboratorios;

public class TestCartera {

	public static void main(String[] args) {
		Cartera cartera1 = new Cartera ("Alan Turing", 200);
		
		//cartera1.saldo = -1000;
		cartera1.retirar(500);
		cartera1.getSaldo();
		
		cartera1.ingresar(-50);
		cartera1.getSaldo();

		cartera1.retirar(20);
		cartera1.getSaldo();
	
	}

}
