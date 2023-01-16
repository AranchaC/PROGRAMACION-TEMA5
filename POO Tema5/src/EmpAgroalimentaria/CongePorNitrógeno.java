package EmpAgroalimentaria;

public class CongePorNitrógeno extends ProdCongelado {
	protected int tiempoExpo;

	public CongePorNitrógeno(String nombre, String fechaCad, String fechaEnva, String paísOrigen, int numLote,
			double tempManten, int tiempoExpo) {
		super(nombre, fechaCad, fechaEnva, paísOrigen, numLote, tempManten);
		this.tiempoExpo = tiempoExpo;
	}

	public int getTiempoExpo() {
		return tiempoExpo;
	}

	public void setTiempoExpo(int tiempoExpo) {
		this.tiempoExpo = tiempoExpo;
	}

	@Override
	public String toString() {
		return super.toString()+"\n Tiempo de exposición al nitrógeno= " + tiempoExpo + " segundos.";
	}
	

}
