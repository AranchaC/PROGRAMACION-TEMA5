package EjHabladores;

public class Aparato {
	protected int consumo;
	protected int precio;
	
	public Aparato(int consumo, int precio) {
		super();
		this.consumo = consumo;
		this.precio = precio;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "consumo=" + consumo + ", precio=" + precio ;
	}
	
	

}
