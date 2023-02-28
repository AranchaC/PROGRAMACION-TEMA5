package PruebaExamen;

public class PruebaSerVivo {

	public static void main(String[] args) {
		GrupoPorEdad vivos = new GrupoPorEdad(8);
		
		vivos.add(new SerVivo(4));
		vivos.add(new SerVivo(10));
		vivos.add(new Alumno(15,423));
		vivos.add(new Alumno(22,236));
		
		//imprimo lista inicial
		System.out.println(vivos);
		System.out.println();
		
		vivos.insertaEnOrden(new Persona(12));
		vivos.insertaEnOrden(new SerVivo(18));
		vivos.insertaEnOrden(new Alumno(6,321));
		
		//imprimo lista con nuevos elementos añadidos en orden.
		System.out.println(vivos);

	}

}
