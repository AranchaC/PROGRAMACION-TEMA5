package FigurasPolimorfismo;

public abstract class Figura {
	private int posX, posY;
		
	
	public Figura() {
		super();
		this.posX = posX;
		this.posY = posY;
	}


	private int getPosX() {
		return posX;
	}


	private void setPosX(int posX) {
		this.posX = posX;
	}


	private int getPosY() {
		return posY;
	}


	private void setPosY(int posY) {
		this.posY = posY;
	}


	public abstract double perimetro();
	
	
	public String toString() {
		return "Soy una figura";
	}

}
