package trabajo.juego.truco;



public abstract class Jugadores {
	
	 private String nombre;
	 
	 
	 public Jugadores(String nombre){
		 this.setNombre(nombre);
	
	 }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract Carta cartaJugar();
	
	public abstract void mostrarMano();
}
