package poo.examenPratica;

import java.util.ArrayList;

public class Almacen {
	ArrayList <Producto> productos = new ArrayList<>();

	public void agregarProducto(Producto p) {
	    if (productos.size() < 15) {
	        productos.add(p);
	        System.out.println("Producto añadido: " + p.getMarca());
	    } else {
	        System.out.println("Error: Capacidad máxima alcanzada (15/15)");
	    }
	}
		
	public double calcularTotal() {
		double precioTotal = 0;
		for (Producto p : productos) {
			precioTotal += p.getPrecio() ;
		}

		return precioTotal ;
	}
	
	public void eliminarPorMarca(String marca) { //Hacia atrás para evitar saltos de índice
	    for (int i = productos.size() - 1; i >= 0; i--) {
	        if (productos.get(i).getMarca().equalsIgnoreCase(marca)) {
	            productos.remove(i);
	        }
	    }
	}

	public void buscarPorMarca(String marca) {
		for (Producto p : productos) {
			if (p.getMarca().equalsIgnoreCase(marca)) {
				System.out.println(p.toString());
			}
		}
	}

	/* Datos específicos mediante Casting
	if (p instanceof Smartphone) {
		Smartphone s = (Smartphone) p; // Aquí "transformas" p en Smartphone
		System.out.println(" - Almacenamiento: " + s.getAlmacenamiento() + "GB");
	} else if (p instanceof Laptop) {
		Laptop l = (Laptop) p; // Aquí "transformas" p en Laptop
		System.out.println(" - Procesador: " + l.getProcesador());
	}*/
	
}
