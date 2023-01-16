package EmpAgroalimentaria;

public class ProdFresco extends Producto {

	public ProdFresco(String nombre, String fechaCad, String fechaEnva, String paísOrigen, int numLote) {
		super(nombre, fechaCad, fechaEnva, paísOrigen, numLote);

	}
	
	public String toString() {
		return "Tipo de Producto: " +TipoProducto.FRESCO + super.toString();
	}

	

}
