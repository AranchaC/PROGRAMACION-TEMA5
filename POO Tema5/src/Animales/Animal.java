package Animales;

public abstract class Animal {
	protected int peso;

	public Animal(int peso) {
		super();
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Soy un Animal con peso=" + peso + "gr.\n";
	}
	
	

}
