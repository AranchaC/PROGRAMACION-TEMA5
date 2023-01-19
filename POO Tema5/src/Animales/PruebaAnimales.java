package Animales;

public class PruebaAnimales {
	
	public static void main(String[] args) {
		Animal[] arca = new Animal[10];
		Volador[] voladores = new Volador[4];
		
		arca[0] = new Perro (4321, "Pitbull");
		arca[1] = new Gato (1240, "Persa");
		arca[2] = new Pato (2200, 2, "Verde");
		
		voladores[0] = new Pato(2130, 2, "Azul");
		voladores[1] = new Murciélago(670);
		
		for (Animal a : arca) {
			System.out.println(a);
		}
		
		for (Volador v : voladores) {
			if (v==null) break;
			v.volar();
		}
	}

}
