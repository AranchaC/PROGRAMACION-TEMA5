package PruebaExamen;

public class Alumno extends Persona {
	protected int nia;

	public Alumno(int edad, int nia) {
		super(edad);
		this.nia = nia;
	}

	@Override
	public String toString() {
		return "Alumno y edad: "+edad+" y nia: " + nia + "\n";
	}
	
	
}
