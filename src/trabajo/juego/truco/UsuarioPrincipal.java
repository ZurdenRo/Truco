package trabajo.juego.truco;

import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioPrincipal extends Jugadores{
	
	private ArrayList<Carta> cartasManoUserDefault;
	/*
	 	Esta clase se extiende de una clase abstracta, obtiene el nombre y crea un array al objeto. 
	 */
	public UsuarioPrincipal(String nombre) {
		super(nombre);
		this.setCartasUserDefault(new ArrayList<>());
	}
	
	public ArrayList<Carta> getCartasUserDefault() {
		return cartasManoUserDefault;
	}
	
	public void setCartasUserDefault(ArrayList<Carta> cartajug) {
		this.cartasManoUserDefault = cartajug;
	}

	/*
	 *El siguiente metodo el usuario ingresa un numero(1 to 3) del cual elige 
	 *la carta a jugar y la deposita en el tablero. 
	 */
	@Override
	public Carta cartaJugar() {
		@SuppressWarnings("resource")
		Scanner ingresarNum  = new Scanner(System.in);
		int num = ingresarNum.nextInt();	
		return this.getCartasUserDefault().get(num);
	}
	
	@Override
	public void mostrarMano() {
		for (int i = 0 ; i < this.getCartasUserDefault().size() ; i ++){
			System.out.println(this.getCartasUserDefault().get(i));
		}
		
	}
	
}