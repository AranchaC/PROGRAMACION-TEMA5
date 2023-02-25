package PruebaExamen;

public class PruebaSerVivo {

	public static void main(String[] args) {
		GrupoPorEdad vivos = new GrupoPorEdad(8);
		
		vivos.add(new SerVivo(8));
		vivos.add(new SerVivo(10));
		vivos.add(new Alumno(15,123));
		vivos.add(new Alumno(18,236));
		
		System.out.println(vivos);
		System.out.println();
		
		vivos.insertaEnOrden(new Persona(12));
		
		System.out.println(vivos);

	}

}
