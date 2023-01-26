package EjHabladores;

public class Loro extends Ave implements Hablador {
	protected String región;
	protected String color;
	public Loro(String sexo, int edad, String región, String color) {
		super(sexo, edad);
		this.región = región;
		this.color = color;
	}
	public String getRegión() {
		return región;
	}
	public void setRegión(String región) {
		this.región = región;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nregión=" + región + ", color=" + color;
	}
	@Override
	public void hablar() {
		System.out.println("Hola soy un LORO y se hablar.\n"+toString());
		
	}
	
	

}
