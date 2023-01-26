package EjHabladores;

public class Alumno extends Persona implements Hablador {
	protected String carrera;
	protected int curso;
	
	public Alumno(String nombre, int edad, String carrera, int curso) {
		super(nombre, edad);
		this.carrera = carrera;
		this.curso = curso;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\ncarrera=" + carrera + ", curso=" + curso + "]";
	}

	@Override
	public void hablar() {
		System.out.println("Hola soy un ALUMNO  y se hablar.\n"+toString());
		
	}
	
	
	
	

}
