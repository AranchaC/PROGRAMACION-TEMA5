package EmpAgroalimentaria;

public class ProdRefrigerado extends ProdNoFresco{
	protected int codSuperv;

	public ProdRefrigerado(String nombre, String fechaCad, String fechaEnva, String paísOrigen, int numLote,
			double tempManten, int codSuperv) {
		super(nombre, fechaCad, fechaEnva, paísOrigen, numLote, tempManten);
		this.codSuperv = codSuperv;
	}

	public int getCodSuperv() {
		return codSuperv;
	}

	public void setCodSuperv(int codSuperv) {
		this.codSuperv = codSuperv;
	}
	
	@Override
	public String toString() {
		return "Tipo de Producto: " +TipoProducto.REFRIGERADO +super.toString()+ "\n Código Supervisión: " + codSuperv;
	}

}
