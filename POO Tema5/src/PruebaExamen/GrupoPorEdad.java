package PruebaExamen;

import java.util.Arrays;

public class GrupoPorEdad {
	private SerVivo[] seres;
	public int size;
	
	public GrupoPorEdad(int max) {
		seres=new SerVivo[max];
		size = 0;
	}
	
	public boolean isFull() {
		return size==seres.length;
	}
	public boolean add(SerVivo m) {
		if (isFull()) return false;
		seres[size] = m;
		size++;
		return true;			
	}
	
	/*
	 * 	public boolean add(SerVivo o) {
		if(size< seres.length) {
			seres[size]= o;
			size++;
			return true;
		}
		return false;
	}*/

	public SerVivo[] getSeres() {
		return seres;
	}

	public void setSeres(SerVivo[] seres) {
		this.seres = seres;
	}

	@Override
	public String toString() {
		/*String texto = "";
		for (int i=0; i<seres.length; i++) {
			if (seres[i] != null) {
				texto += seres[i].toString();
			}
		}
		return texto;*/
		return Arrays.toString(seres);
	}
	
	/*@Override
	public String toString() {
		StringBuilder stb = new StringBuilder();
		for (int i=0; i<seres.length; i++) {
			if (seres[i] != null) {
				stb = stb.append(seres[i]);
			}
		}
		return stb.toString();
	}*/
	
	public void insertaEnOrden(SerVivo ser) {
		for (int i=0; i<seres.length; i++) {
			if (seres[i]!= null) {
				if (ser.edad < seres[i].edad) {
					//aquí ya tengo la posicion i.
					//muevo los elementos de i a i+1,
					//y asigno ser a i.
					seres[i+1]=seres[i];
					seres[i] = ser;
					size++;
				}
			}//if
		}//for		
	}//insertarEnOrden
	
	
	/*		for  ( int cursor=numElementos; cursor>index; cursor--) {
			lista[cursor] = lista[cursor-1];
		}
		lista[index] = obj;
		numElementos++;
		return true;*/
	

}
