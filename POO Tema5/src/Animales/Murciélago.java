package Animales;

public class Murciélago extends Mamífero implements Volador{

	public Murciélago(int peso) {
		super(peso);
	}

	@Override
	public String toString() {
		return "Murciélago []";
	}

	@Override
	public void volar() {
		System.out.println("Vuelo en la noche");
		
	}
	
	

}
