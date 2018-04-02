package trabajo.juego.truco;

import java.util.ArrayList;

public class Tablero {

	UsuarioPrincipal user;
	UsuarioMaquina userMaq;
	Mazo m1;
	Boolean envido;
	Boolean truco;
	Boolean reTruco;
	
	private ArrayList<Carta> cartaTablero;
	
	public Tablero(){
		this.setCartaTablero(new ArrayList<>());
	}
	
	public ArrayList<Carta> getCartaTablero() {
		return this.cartaTablero;
		
	}

	public void setCartaTablero(ArrayList<Carta> cartaTablero) {
		this.cartaTablero = cartaTablero;
	}
	/*
	 * El jugador depositar la carta en este metodo y el mismo metodo agarra la cartas del jugador 
	 * para luego calular que carta es mas fuerte
	 */
	
	public void seleccionCartas(UsuarioPrincipal user){
		this.getCartaTablero().add(user.cartaJugar());
	}
	
	public void seleccionCartasMachine(UsuarioMaquina userMaq){
		this.getCartaTablero().add(userMaq.cartaJugar());
	}
	/*
	 * el metodo de abajo es un borrador, 
	 * simplente es para ver como funciona el selector de cartas.
	 */
	public void evaluacionCartas(){
		if(this.getCartaTablero().get(0).getNumero() > this.getCartaTablero().get(1).getNumero()){
			System.out.println("Win card play User :" + this.getCartaTablero().get(0));
		}
		else {
			if(this.getCartaTablero().get(0).getNumero() < this.getCartaTablero().get(1).getNumero()){
				System.out.println("Win card play Machine :" + this.getCartaTablero().get(1));
			}
		}
	}
	public void mostrarCartasTablero(){
		for (int i = 0 ; i < this.getCartaTablero().size() ; i++){
			System.out.println(this.getCartaTablero().get(i));
		}
	}

}