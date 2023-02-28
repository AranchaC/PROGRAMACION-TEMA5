package PruebaExamen;

public class ListaD {
	protected NúmeroGrande inicio;
	protected NúmeroGrande fin;
	protected int tamaño;
	public ListaD() {
		inicio=fin=null;
		tamaño=0;
	}
	public boolean add(byte cifra) {
		NúmeroGrande nuevo= new NúmeroGrande(cifra);
		if(fin==null) {
			inicio=fin=nuevo;
		}
		else {
			fin.siguiente=nuevo;
			fin=nuevo;
			tamaño++;
		}
		return true;
	}
	public String toString() {
		String res="";
		NúmeroGrande aux=inicio;
		while(aux!=null) {
			res+=aux.cifra;
			aux=aux.siguiente;
		};
		String res2="";
		for(int i=res.length()-1;i>=0;i--) {
			res2+=res.charAt(i);
		}
		return res2;
	}
	public long valor(String s) {
		long l =Long.parseLong(s);
		return l;
	}
}
