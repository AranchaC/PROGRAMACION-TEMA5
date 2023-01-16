package BicicletaPDF;

public class BicicletaTandem extends Bicicleta{
	protected int numAsientos;

	public BicicletaTandem(int velocidadActual, int platoActual, int piñonActual, int numAsientos) {
		super(velocidadActual, platoActual, piñonActual);
		this.numAsientos = numAsientos;
	}

	@Override
	public String toString() {
		return " BicicletaTandem [numAsientos=" + numAsientos + "] "+super.toString();
	}
	
	@Override
	public int acelerar() {
		//super.acelerar(); para invocar al método acelerar de la clase padre bicicleta.
		return velocidadActual*=4;
	}
	

}
