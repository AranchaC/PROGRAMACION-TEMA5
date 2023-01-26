package EjHabladores;

public class Canario extends Ave {
	protected String canta;
	
	public Canario(String sexo, int edad, String canta) {
		super(sexo, edad);
		canta = this.canta;

	}

	public String getCanta() {
		return canta;
	}

	public void setCanta(String canta) {
		this.canta = canta;
	}
	
	

	
	

}
