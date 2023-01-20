package Multimedia;

import java.util.Arrays;

public class PruebaMultimedia {

	public static void main(String[] args) {
		ListaMultimedia obras = new ListaMultimedia (10);//ej4 
		//ListaMultimedia 
		
		obras.add(new Película ("LA LA LAND","DAMIEN CHAZELLE", 180, Formato.DVD, "RYAN GOSLING", "EMMA STONE"));
		obras.add(new Película ("LIBRO DE LA SELVA","YO MISMA", 90, Formato.AVI, null, null));
		obras.add(new Película ("TITANIC","JAMES CAMERON", 120, Formato.MP3, "LEO DI CAPRIO","KATE WINSLET"));
		obras.add(new Película ("VIUDA NEGRA","MARVEL", 130, Formato.MOV, null, "SCARLETT JOHANSSON"));
		obras.add(new Película ("IRON MAN","MARVEL", 115, Formato.MPG, "ROBERT DOWNEY JR", null));
		
		System.out.println(obras.toString());
		obras.sort();
		System.out.println(obras);
	}

}
