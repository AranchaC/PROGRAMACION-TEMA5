package Animales;

public class Gato extends Mamífero{
	protected String raza;

	public Gato(int peso, String raza) {
		super(peso);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return super.toString()+"Gato con raza=" + raza + ".\n";
	}
	

}
