package BicicletaPDF;

public class BicicletaMontaña extends Bicicleta {
	protected int suspension;
		
	public BicicletaMontaña(int velocidadActual, int platoActual, int piñonActual, int suspension) {
		super(velocidadActual, platoActual, piñonActual);
		this.suspension = suspension;
	}

	public void cambiarSuspension(int suspension) {
		this.suspension = suspension;
	}

	@Override
	public String toString() {
		return  " BicicletaMontaña [suspension=" + suspension + "] "+super.toString();
	}
	
	@Override
	//Tercer punto del ej6: para acceder al metodo acelerar de la clase padre Biciclete,
	//se haría con super.acelerar().
	public int acelerar() {
		return velocidadActual*=3;
	}
	
	

}
