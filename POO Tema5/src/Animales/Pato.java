package Animales;

public class Pato extends Ave implements Volador{
	protected String color;

	public Pato(int peso, int numAlas, String color) {
		super(peso, numAlas);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString()+"Pato con color=" + color + ".\n";
	}

	@Override
	public void volar() {
		System.out.println("Volando voy, volando vengo");
		
	}
	

}
