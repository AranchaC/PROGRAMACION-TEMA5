package EmpAgroalimentaria;

public class ProdCongelado extends ProdNoFresco {

	public ProdCongelado(String nombre, String fechaCad, String fechaEnva, String paísOrigen,
			int numLote, double tempManten) {
		super(nombre, fechaCad, fechaEnva, paísOrigen, numLote, tempManten);
	}

	public String toString() {
		return "Tipo de Producto: "+TipoProducto.CONGELADO+ super.toString();
	}

}
