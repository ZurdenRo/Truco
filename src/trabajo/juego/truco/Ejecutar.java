package trabajo.juego.truco;



public class Ejecutar {

	public static void main(String[] args) {
		Mazo miMazo = new Mazo();
		UsuarioPrincipal user1 = new UsuarioPrincipal("Rodrigo");
		UsuarioMaquina userMaq = new UsuarioMaquina("KABEL");
		Tablero tab1 = new Tablero();
		miMazo.repartirCartas(userMaq.getCartasManoMachine());
		userMaq.mostrarMano();		
	}

}
