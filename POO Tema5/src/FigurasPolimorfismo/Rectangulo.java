package FigurasPolimorfismo;

public class Rectangulo extends Figura {
	private int base;
	private int altura;
	public static final int NUM_LADOS = 4;
	
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
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}
	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public double perimetro() {
		return base*2+altura*2;
	}
	

}
