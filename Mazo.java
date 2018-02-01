package trabajo.testing.truco;

import java.util.ArrayList;
import trabajo.testing.truco.Carta.Palo;
import java.util.Random;


public class Mazo {
	private ArrayList <Carta> mazo;
	private static Integer sumadorPuntajes = 12;
	
	public Mazo(){
		this.setMazo(new ArrayList <Carta> ());		
		for (int i = 1 ;  i < 8; i++){		
			if(i == 1 && sumadorPuntajes == 12){
				Carta misCartas = new Carta(i,Palo.Espada,12);
				mazo.add(misCartas);
				sumadorPuntajes = sumadorPuntajes - 5;
			}
			else if(i==2 && sumadorPuntajes == 7){
				Carta misCartas = new Carta(i,Palo.Espada,7);
				mazo.add(misCartas);
				sumadorPuntajes = sumadorPuntajes + 1;
			}
			else if ( i == 3 && sumadorPuntajes == 8){
				Carta misCartas = new Carta(i,Palo.Espada,8);
				mazo.add(misCartas);
				sumadorPuntajes = sumadorPuntajes - 7;
			}
			else if (i == 4 && sumadorPuntajes == 1){
				Carta misCartas = new Carta(i,Palo.Espada,1);
				mazo.add(misCartas);
				sumadorPuntajes = sumadorPuntajes + 1;
			}
			else if (i == 5 && sumadorPuntajes == 2){
				Carta misCartas = new Carta(i,Palo.Espada,2);
				mazo.add(misCartas);
				sumadorPuntajes = sumadorPuntajes + 1;
				
			}
			else if (i == 6 && sumadorPuntajes == 3){
				Carta misCartas = new Carta(i,Palo.Espada,3);
				mazo.add(misCartas);
			}
			else{
				Carta misCartas = new Carta(i,Palo.Espada,10);
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

	public void mostrarCartaMazo(){
		for (int i = 0 ; i < this.getMazo().size() ; i ++){
			System.out.println(this.getMazo().get(i));
		}
		
	}

	
	public void repartirCartas(ArrayList<Carta> cartasUser){
		Random ran = new Random();
		if (cartasUser.size() <= 2){
			for (int i = 0 ; i < 3 ; i++){
				int miRandom = 0  + ran.nextInt(3);
				if ( cartasUser.size() < 3){
					
					cartasUser.add(this.getMazo().get(miRandom));
				}	
			}
			eliminarCartasRepetidas(cartasUser);
		}
	}	
	
	public void eliminarCartasRepetidas(ArrayList<Carta> cartaUser){
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
			for(int i = 0 ; i< cartaUser.size(); i++){
				for ( int j = 0 ; j < this.getMazo().size() ; j++){
					if(cartaUser.get(i) == this.getMazo().get(j)){
						this.getMazo().remove(j);
					}
				}
			}
		}
	}
	
}