package trabajo.juego.truco;

import java.util.ArrayList;


public class UsuarioMaquina extends Jugadores{

	private ArrayList<Carta> cartasManoMachine;
	
	/*
 	Esta clase se extiende de una clase abstracta, obtiene el nombre y crea un array al objeto. 
	 */
	public UsuarioMaquina(String nombre) {
		super(nombre);
		this.setCartasManoMachine(new ArrayList<>());
	}

	public ArrayList<Carta> getCartasManoMachine() {
		return cartasManoMachine;
	}

	public void setCartasManoMachine(ArrayList<Carta> cartajug) {
		this.cartasManoMachine = cartajug;
	}

	@Override
	public Carta cartaJugar() {
		for (int i = 0 ; i < 3 ; i++){
			
		}
	}

	@Override
	public void mostrarMano() {
		for (int i = 0 ; i < this.getCartasManoMachine().size() ; i ++){
			System.out.println(this.getCartasManoMachine().get(i));
		}
		
	}

}