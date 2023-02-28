package PruebaExamen;

public class PruebaCifra {

	public static void main(String[] args) {
		ListaD lista=new ListaD();
		lista.add((byte)3);
		lista.add((byte)1);
		lista.add((byte)2);
		lista.add((byte)1);
		lista.add((byte)5);
		System.out.println(lista.valor(lista.toString()));
	}

}
