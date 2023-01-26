package EjHabladores;

public class Ave {
	protected String sexo;
	protected int edad;
	
	public Ave(String sexo, int edad) {
		super();
		this.sexo = sexo;
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "sexo=" + sexo + ", edad=" + edad;
	}
	
	
	
	

}
