package EmpAgroalimentaria;

public class CongePorAgua extends ProdCongelado {
	protected double salinidad;

	public CongePorAgua(String nombre, String fechaCad, String fechaEnva, String paísOrigen,
			int numLote, double tempManten, double salinidad) {
		super(nombre, fechaCad, fechaEnva, paísOrigen, numLote, tempManten);
		this.salinidad = salinidad;
	}

	public double getSalinidad() {
		return salinidad;
	}

	public void setSalinidad(double salinidad) {
		this.salinidad = salinidad;
	}

	@Override
	public String toString() {
		return super.toString()+ "\n Salinidad en agua= " + salinidad + "gr / litro de agua.";
	}
	

}
