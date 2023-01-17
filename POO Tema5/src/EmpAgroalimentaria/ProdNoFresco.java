package EmpAgroalimentaria;

public class ProdNoFresco extends Producto {
	protected double tempManten;

	public ProdNoFresco(String nombre, String fechaCad, String fechaEnva, String paísOrigen,
			int numLote, double tempManten) {
		super(nombre, fechaCad, fechaEnva, paísOrigen, numLote);
		this.tempManten = tempManten;
	}

	public double getTempManten() {
		return tempManten;
	}

	public void setTempManten(double tempManten) {
		this.tempManten = tempManten;
	}

	@Override
	public String toString() {
		return super.toString()+ "\n Temperatura Mantenimiento: " + tempManten;
	}
	
	
	


	

}
