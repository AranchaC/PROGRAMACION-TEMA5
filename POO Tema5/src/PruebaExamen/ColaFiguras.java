package PruebaExamen;

import java.util.Arrays;

import FigurasPolimorfismo.Figura;

public class ColaFiguras {
	Object[] figuras;
	int size, head, tail;
	
	public ColaFiguras(int n) {
		figuras = new Object[n];
		size=head=tail=0;
	} 
	
	public boolean add(Object obj) {
		if (isFull()) return false;
		figuras[size] = obj;
		size++;
		return true;
		
		/*<<add cola circular>>
		figuras[tail] = obj;
		size++;
		tail++;
		if (tail == figuras.length)	tail=0;
		return true;*/
	}//add
	
	public Object remove() {
		if (isEmpty())return null;
		Object res = figuras[head];
		for(int i=1; i<size; i++) {
			figuras[i-1]=figuras[i];
		}
		figuras[size-1]= null;
		size--;
		return res;
		
		/*<<remove cola circular>>
		Object res = figuras[head];
		figuras[head] = null;
		head++;
		size--;
		if (head == figuras.length) head=0;
		return res;*/
	}
	
	boolean isEmpty() {
		return size==0;
	} 
	
	boolean isFull() {
		return size==figuras.length;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(figuras);
	}
} // ColaFiguras


