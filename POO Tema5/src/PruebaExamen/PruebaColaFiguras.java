package PruebaExamen;

import FigurasPolimorfismo.Figura;

public class PruebaColaFiguras {

	public static void main(String[] args) {
		ColaFiguras figuras = new ColaFiguras(10);
		System.out.println(figuras);
		
		System.out.println("meto 19 elementos, solo se puede 10 "); 
		for (int i=1; i<=19; i++) {
			figuras.add(i);
		}//for
		System.out.println(figuras);
		
		System.out.println("\nsaco 5 elementos");
		for (int i=1; i<=5; i++) {
			System.out.println("Saco "+figuras.remove());;
		}//for
		System.out.println(figuras);
		
		System.out.println("\nañado 9 elementos, solo puede 5");
		for (int i=11; i<=19; i++) {
			figuras.add(i);
		}//for
		System.out.println(figuras);
		
		while (!figuras.isEmpty()) {
			System.out.println("saco " + figuras.remove());
			System.out.println(figuras);
		}//while
	}

	

}
