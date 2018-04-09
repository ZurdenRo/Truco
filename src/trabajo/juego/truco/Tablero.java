package trabajo.juego.truco;

import java.util.ArrayList;

public class Tablero {

	UsuarioPrincipal user;
	UsuarioMaquina userMaq;
	Mazo m1;
	private Boolean envido;
	private Boolean truco;
	Boolean turnos;

	private static final Integer numParInicia = 1;
	
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
		try{
			this.getCartaTablero().add(user.cartaJugar());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public void seleccionCartasMachine(UsuarioMaquina userMaq){
		this.getCartaTablero().add(userMaq.cartaJugar());
	}
	/*
	 * el metodo de abajo es un borrador, 
	 * simplente es para ver como funciona el selector de cartas y cual decide que gana.
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
	
	public void controladorTurnos(){
		
	}
	
	public void mostrarCartasTablero(){
		for (int i = 0 ; i < this.getCartaTablero().size() ; i++){
			System.out.println(this.getCartaTablero().get(i));
		}
	}

}