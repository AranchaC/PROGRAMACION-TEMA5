package EjHabladores;

public class Lavadora extends Aparato {
	protected int alto;
	protected int ancho;
	
	public Lavadora(int consumo, int precio, int alto, int ancho) {
		super(consumo, precio);
		this.alto = alto;
		this.ancho = ancho;
	}
	
	

}
