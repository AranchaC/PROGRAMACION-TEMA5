package FigurasPolimorfismo;

public class Circulo extends Figura {
	private int radio;

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	public Circulo(int radio) {
		super();
		this.radio = radio;
	}
	
	public double perimetro() {
		return Math.PI*2*radio;
	}
	
	
	

}
