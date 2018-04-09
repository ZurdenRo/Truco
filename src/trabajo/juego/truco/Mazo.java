package trabajo.juego.truco;

import java.util.ArrayList;
import java.util.Random;

import trabajo.juego.truco.Carta.Palo;


public class Mazo {
	
	private ArrayList <Carta> mazo;	
	/*
	 * El constructor Crea el Mazo agregando todas las cartas a un array.
	 */
	public Mazo(){
		this.setMazo(new ArrayList <Carta> ());	
		for (int i = 1 ;  i < 8; i++){		
			if(i == 1 ){
				Carta misCartas = new Carta(i,Palo.Espada,14);
				mazo.add(misCartas);						
			}
			else if(i == 2){
				Carta misCartas = new Carta(i,Palo.Espada,9);
				mazo.add(misCartas);	
			}
			else if(i == 3){
				Carta misCartas = new Carta(i,Palo.Espada,10);
				mazo.add(misCartas);				
						}
			else if(i == 4){
				Carta misCartas = new Carta(i,Palo.Espada,1);
				mazo.add(misCartas);	
			}
			else if(i == 5){
				Carta misCartas = new Carta(i,Palo.Espada,2);
				mazo.add(misCartas);	
			}
			else if(i == 6){
				Carta misCartas = new Carta(i,Palo.Espada,3);
				mazo.add(misCartas);	
			}
			else if(i == 7){
				Carta misCartas = new Carta(i,Palo.Espada,12);
				mazo.add(misCartas);	
			}
			}
		/*
		for (int i = 1 ;  i < 8; i++){
			Carta misCartas = new Carta(i,Palo.Basto);
			mazo.add(misCartas);
			}
		for (int i = 10 ;  i < 13; i++){
			Carta misCartas = new Carta(i,Palo.Basto);
			mazo.add(misCartas);
			}
		for (int i = 1 ;  i < 8; i++){
			Carta misCartas = new Carta(i,Palo.Copa);
			mazo.add(misCartas);
			}
		for (int i = 10 ;  i < 13; i++){
			Carta misCartas = new Carta(i,Palo.Copa);
			mazo.add(misCartas);
			}
		for (int i = 1 ;  i < 8; i++){
			Carta misCartas = new Carta(i,Palo.Oro);
			mazo.add(misCartas);
			}
		for (int i = 10 ;  i < 13; i++){
			Carta misCartas = new Carta(i,Palo.Oro);
			mazo.add(misCartas);
			}*/
	}
	
	public ArrayList<Carta> getMazo() {
		return mazo;
	}

	public void setMazo(ArrayList<Carta> mazo) {
		this.mazo = mazo;
	}

	/*
	 Este metodo muestra las cartas del usuario. 
	 */
	public void mostrarCartaMazo(){
		for (int i = 0 ; i < this.getMazo().size() ; i ++){
			System.out.println(this.getMazo().get(i));
		}
		
	}

	/*
	 Este metodo reparte cartas al usuario especifico.. 
	 */
	public void repartirCartas(ArrayList<Carta> cartasUser){
		Random ran = new Random();
		if (cartasUser.size() <= 2){
			for (int i = 0 ; i < 3 ; i++){
				int miRandom = 0  + ran.nextInt(this.getMazo().size());
				if ( cartasUser.size() < 3){
					cartasUser.add(this.getMazo().get(miRandom));
				}	
			}
			retirarCartasRepetidasMano(cartasUser);
		}
		eliminarCartasRepartidasMazo(cartasUser);
	}	
	/*
	 * Este metodo se encarga de no repartir mismas cartas, una vez encontrada las cartas 
	 * las compara con el mazo  y las elimina.
	 * */
	public void retirarCartasRepetidasMano(ArrayList<Carta> cartaUser){
		if (cartaUser.get(0)== cartaUser.get(1)){
			cartaUser.remove(1);
			repartirCartas(cartaUser);
		}
		else if (cartaUser.get(1) == cartaUser.get(2)){
			cartaUser.remove(2);
			repartirCartas(cartaUser);
		}
		else if (cartaUser.get(0) == cartaUser.get(2)){
			cartaUser.remove(2);
			repartirCartas(cartaUser);
		}
		else{
			System.out.println("Cartas repetidas de mano del jugador fueron eliminadas.");
		}
	}
	/*
	 * Este metodo una vez finalizado el proceso de repartir cartas
	 * se encarga de eliminar las cartas del mazo que ya las tienen
	 * los usuarios.
	 * */
	public void eliminarCartasRepartidasMazo(ArrayList<Carta> user){
		for(int i = 0 ; i< user.size(); i++){
			for ( int j = 0 ; j < this.getMazo().size() ; j++){
				if(user.get(i) == this.getMazo().get(j)){
					this.getMazo().remove(j);
				}
			}
		}
	}

}