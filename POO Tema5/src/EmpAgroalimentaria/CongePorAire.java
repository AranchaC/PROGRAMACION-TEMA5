package EmpAgroalimentaria;

public class CongePorAire extends ProdCongelado {
	protected int nitro, oxígeno, dióxCarbono, vaporAgua;

	public CongePorAire(String nombre, String fechaCad, String fechaEnva, String paísOrigen,
			int numLote, double tempManten, int nitro, int oxígeno, int dióxCarbono, int vaporAgua) {
		super(nombre, fechaCad, fechaEnva, paísOrigen, numLote, tempManten);
		this.nitro = nitro;
		this.oxígeno = oxígeno;
		this.dióxCarbono = dióxCarbono;
		this.vaporAgua = vaporAgua;
	}

	public int getNitro() {
		return nitro;
	}

	public void setNitro(int nitro) {
		this.nitro = nitro;
	}

	public int getOxígeno() {
		return oxígeno;
	}

	public void setOxígeno(int oxígeno) {
		this.oxígeno = oxígeno;
	}

	public int getDióxCarbono() {
		return dióxCarbono;
	}

	public void setDióxCarbono(int dióxCarbono) {
		this.dióxCarbono = dióxCarbono;
	}

	public int getVaporAgua() {
		return vaporAgua;
	}

	public void setVaporAgua(int vaporAgua) {
		this.vaporAgua = vaporAgua;
	}

	@Override
	public String toString() {
		return super.toString()+"\n Composición aire congelación: nitrógeno=" + nitro + ", oxígeno=" + oxígeno + ", dióxCarbono=" + dióxCarbono + ", vaporAgua="
				+ vaporAgua;
	}
	 

}
