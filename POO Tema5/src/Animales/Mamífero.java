package Animales;

public abstract class Mamífero extends Animal {
	protected int tiempoLactancia;

	public Mamífero(int peso) {
		super(peso);
	}

	public int getTiempoLactancia() {
		return tiempoLactancia;
	}

	public void setTiempoLactancia(int tiempoLactancia) {
		this.tiempoLactancia = tiempoLactancia;
	}

	@Override
	public String toString() {
		return super.toString()+"Mamífero con tiempoLactancia=" + tiempoLactancia + ".\n";
	}
	
	

}
