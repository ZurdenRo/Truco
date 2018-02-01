package trabajo.testing.truco;

public class Carta {

	public enum Palo{Espada, Basto , Oro, Copa;}
	
	private Palo palos;
	private Integer numero;
	private Integer puntajesCartas;

	public Carta(Integer numero, Palo palos,Integer puntajesCartas){
		this.setPalos(palos);
		this.setNumero(numero);
		this.setPuntajesCartas(puntajesCartas);
	}
	
	
	public Integer getPuntajesCartas() {
		return puntajesCartas;
	}


	public void setPuntajesCartas(Integer puntajesCartas) {
		this.puntajesCartas = puntajesCartas;
	}


	public Palo getPalos() {
		return palos;
	}
	
	public void setPalos(Palo palos) {
		this.palos = palos;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public String toString (){
		return this.getNumero().toString().concat("|").concat(this.getPalos().toString()).concat("|").concat(this.getPuntajesCartas().toString());
	}
}
