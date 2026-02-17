package poo.herencia;

import java.util.ArrayList;

public class AppCarrito {

	public static void main(String[] args) {
		ArrayList<Producto>productos = new ArrayList<>();
		
		Smartphone smartphone = new Smartphone("Iphone15", 1500.99f, "32GB");
		Television television = new Television("Telemuyguapa", 2000.85f, 50);
		Producto smartphone2 = new Smartphone("Samsung80K", 1300.99f, "64GB");
		
		productos.add(smartphone);
		productos.add(television);
		productos.add(smartphone2);
	
		for (Producto p : productos) {
		    System.out.println(p.toString());
		}
		
		//¿Por qué puedo meter un Smartphone en una lista de Productos? Porque un Smartphone "ES UN" Producto.
		
	}

}
