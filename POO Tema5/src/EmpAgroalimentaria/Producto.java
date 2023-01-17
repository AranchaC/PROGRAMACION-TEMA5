package EmpAgroalimentaria;

public class Producto {
	protected String nombre, fechaCad, fechaEnva, paísOrigen;
	protected int numLote;
			
	public Producto(String nombre, String fechaCad, String fechaEnva, String paísOrigen, int numLote) {
		super();
		this.nombre = nombre;
		this.fechaCad = fechaCad;
		this.fechaEnva = fechaEnva;
		this.paísOrigen = paísOrigen;
		this.numLote = numLote;
	}	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaCad() {
		return fechaCad;
	}

	public void setFechaCad(String fechaCad) {
		this.fechaCad = fechaCad;
	}

	public String getFechaEnva() {
		return fechaEnva;
	}

	public void setFechaEnva(String fechaEnva) {
		this.fechaEnva = fechaEnva;
	}

	public String getPaísOrigen() {
		return paísOrigen;
	}

	public void setPaísOrigen(String paísOrigen) {
		this.paísOrigen = paísOrigen;
	}

	public int getNumLote() {
		return numLote;
	}

	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}

	public String toString() {
		return "\n Nombre: "+ nombre +"\n Número de lote: "+ numLote + "\n Fecha Caducidad: "+fechaCad+
				"\n Fecha Envasado: "+ fechaEnva+"\n País de Origen: "+paísOrigen;		
	}



}
