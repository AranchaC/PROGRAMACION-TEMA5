package BicicletaPDF;

public abstract class Vehículo {
	protected int velocidadActual;
		

	public Vehículo(int velocidadActual) {
		super();
		this.velocidadActual = velocidadActual;
	}

	public Vehículo() {
		super();
	}
	
	public abstract int acelerar();
	
	public abstract int frenar();
	
	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	
	
	
	
	

}
