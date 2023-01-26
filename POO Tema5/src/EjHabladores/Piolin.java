package EjHabladores;

public class Piolin extends Canario implements Hablador{
	protected int numPelículas;

	public Piolin(String sexo, int edad, String canta, int numPelículas) {
		super(sexo, edad, canta);
		this.numPelículas = numPelículas;
	}

	public int getNumPelículas() {
		return numPelículas;
	}

	public void setNumPelículas(int numPelículas) {
		this.numPelículas = numPelículas;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"\n numPelículas=" + numPelículas;
	}

	@Override
	public void hablar() {
		System.out.println("Hola soy PIOLÍN y se hablar.\n"+toString());
		
	}

	
	
	
}
