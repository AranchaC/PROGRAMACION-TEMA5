package BicicletaPDF;

public class Bicicleta extends Vehículo {
	//para el ej8, muevo este atributo a la superclase Vehiculo y Bicicleta lo hereda.
	//protected int velocidadActual;
	protected int platoActual;
	protected int piñonActual;
	private static final int PLATODEFECTO = 1;
	private static final int PIÑONDEFECTO = 1;

	public int getPlatoActual() {
		return platoActual;
	}

	public void setPlatoActual(int platoActual) {
		this.platoActual = platoActual;
	}

	public int getPiñonActual() {
		return piñonActual;
	}

	public void setPiñonActual(int piñonActual) {
		this.piñonActual = piñonActual;
	}

	public void cambiarPlato() {
		platoActual = PLATODEFECTO;
	}
	
	public void cambiarPiñon() {
		piñonActual = PIÑONDEFECTO;
	}
	
	public void cambiarPlato(int plato) {
		platoActual=plato;
	}
	
	public void cambiarPiñon(int piñon) {
		piñonActual=piñon;
	}
	
	@Override
	public int acelerar() {
		return velocidadActual*=2;
	}
	
	@Override
	public int frenar() {
		return velocidadActual/=2;
	}	

	public Bicicleta( int velocidadActual, int platoActual, int piñonActual) {
		super(velocidadActual);
		this.platoActual = platoActual;
		this.piñonActual = piñonActual;
	}
	 
	public Bicicleta() {//constructor sin parámetros, con valores iniciales.
		super();
		this.velocidadActual = 0;
		this.platoActual = 1;
		this.piñonActual = 1;	
	}

	@Override
	public String toString() {
		return "Bicicleta [velocidadActual=" + velocidadActual + ", platoActual=" + platoActual + ", piñonActual="
				+ piñonActual + "]";
	}

}
