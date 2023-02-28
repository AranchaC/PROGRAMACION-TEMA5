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

	public SerVivo[] getSeres() {
		return seres;
	}

	public void setSeres(SerVivo[] seres) {
		this.seres = seres;
	}

	// opción toString con StringBuilder
	@Override 
	public String toString() {
		StringBuilder stb = new StringBuilder();
		for (int i=0; i<seres.length; i++) {
			if (seres[i] != null) {
				stb = stb.append(seres[i]);
			}
		}
		return stb.toString();
	}
	
	//Opción toString sin StringBuilder
	/*@Override
	public String toString() {
		String texto = "";
		for (int i=0; i<seres.length; i++) {
			if (seres[i] != null) {
				texto += seres[i].toString();
			}
		}
		return texto;
	}*/
	
	public void insertaEnOrden(SerVivo ser) {
		if (isFull()) {
			System.out.println("LISTA LLENA");
			return;
		}
		int pos=0;//inicializo variable de posición
		//recorro lista para buscar posición
		for (int i=0; i<seres.length; i++) {
			if (seres[i]!= null) {
				//busco la posicion comparando la edad.
				if (ser.edad < seres[i].edad) {					
					//ya tengo la posicion i y se la asigno a pos.
					pos=i;
					//bucle para mover elementos y hacer hueco.
					for (int cursor=size; cursor>pos; cursor--) {
						seres[cursor] = seres[cursor-1];
					}
					seres[pos] = ser;
					break;
				}//if
			}//if
			else {
				seres[i]=ser;
				break;
			}
		}//for		
		size++;				
	}//insertarEnOrden
	
	

}
