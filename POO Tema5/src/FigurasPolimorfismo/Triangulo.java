package FigurasPolimorfismo;

public class Triangulo extends Figura {
	private int base;
	private int altura;
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}
	public Triangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public double perimetro() {
		return base + altura *2;
	}
	

}
