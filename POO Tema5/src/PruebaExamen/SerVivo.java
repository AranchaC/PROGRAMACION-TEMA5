package PruebaExamen;

class SerVivo {
	public int edad;
	
	public SerVivo(int edad) {
		this.edad = edad;
	}
	

	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "SerVivo y edad: " + edad + "\n";
	}
	
	
} // class SerVivo
