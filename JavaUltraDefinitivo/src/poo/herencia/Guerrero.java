package poo.herencia;

public class Guerrero extends Personaje {

	public Guerrero(int salud) {
		super(salud);
	}
	
	public void usarEscudo() {
		this.salud += 10; //si que me deja modificar la salud		
	}
	
	/* si creamos el villano en otro paquete, y tratamos de acceder a salud, nos dara un error,
	 ya que ni pertenece al mismo paqeuete ni es hija de personaje, ya que hemos usado protected
	*/
}
