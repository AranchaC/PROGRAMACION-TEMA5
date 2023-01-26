package EjHabladores;

public class Tv extends Aparato implements Hablador {
	protected int pulgadas;

	public Tv(int consumo, int precio, int pulgadas) {
		super(consumo, precio);
		this.pulgadas = pulgadas;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}
	
	

	@Override
	public String toString() {
		return super.toString()+"\n pulgadas=" + pulgadas;
	}

	@Override
	public void hablar() {
		System.out.println("Hola soy una TV y se hablar.\n"+toString());
		
	}
	
	

}
