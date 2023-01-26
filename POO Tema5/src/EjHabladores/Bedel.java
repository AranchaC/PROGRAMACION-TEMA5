package EjHabladores;

public class Bedel extends Persona implements Hablador{
	protected String turno;
	protected int antiguedad;
	public Bedel(String nombre, int edad, String turno, int antiguedad) {
		super(nombre, edad);
		this.turno = turno;
		this.antiguedad = antiguedad;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString()+"\nturno=" + turno + ", antiguedad=" + antiguedad;
	}
	@Override
	public void hablar() {
		System.out.println("Hola soy un BEDEL y se hablar.\n"+toString());
	}
	
	
}
