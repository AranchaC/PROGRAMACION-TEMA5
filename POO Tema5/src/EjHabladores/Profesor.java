package EjHabladores;

public class Profesor extends Persona implements Hablador {
	protected String despacho;
	protected String email;
	
	public Profesor(String nombre, int edad, String despacho, String email) {
		super(nombre, edad);
		this.despacho = despacho;
		this.email = email;
	}
	public String getDespacho() {
		return despacho;
	}
	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"\ndespacho=" + despacho + ", email=" + email;
	}
	@Override
	public void hablar() {
		System.out.println("Hola soy un PROFESOR y se hablar.\n"+toString());
		
	}
	
	
}
