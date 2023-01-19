package Animales;

public abstract class Ave extends Animal {
	protected int numAlas;

	public Ave(int peso, int numAlas) {
		super(peso);
	}	

	public int getNumAlas() {
		return numAlas;
	}

	public void setNumAlas(int numAlas) {
		this.numAlas = numAlas;
	}

	@Override
	public String toString() {
		return super.toString()+ "Soy Ave "+numAlas+".\n";
	}
	
	

}
