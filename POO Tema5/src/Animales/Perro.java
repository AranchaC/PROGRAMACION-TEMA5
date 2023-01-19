package Animales;

public class Perro extends Mamífero{
	protected String raza;

	public Perro(int peso, String raza) {
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
		return super.toString()+"Perro de raza=" + raza + ".\n";
	}
	
	

}
