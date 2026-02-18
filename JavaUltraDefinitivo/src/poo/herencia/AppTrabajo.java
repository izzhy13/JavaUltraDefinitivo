package poo.herencia;

import java.util.ArrayList;

public class AppTrabajo {

	public static void main(String[] args) {
		ArrayList<Empleado>empleados = new ArrayList<>();
		
		Comercial comercial1 = new Comercial("Viktor", -500);
		Comercial comercial2 = new Comercial("Hector", 500);
		Repartidor repartidor1 = new Repartidor("Isa" , "Zona 1");
		Repartidor repartidor2 = new Repartidor("Jorge" , "Zona 2");
		
		//también se pueden inicializar como
		Empleado comercial3 = new Comercial("Mar", 700);
		
		empleados.add(comercial1);
		empleados.add(comercial2);
		empleados.add(comercial3);
		empleados.add(repartidor1);
		empleados.add(repartidor2);
		
		for (Empleado e : empleados) {
		    System.out.println("Empleado: " + e.nombre + " - Salario: " + e.getSalario());
		}
	}
}