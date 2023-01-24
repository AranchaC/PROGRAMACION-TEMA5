package Multimedia;

import java.util.Arrays;

public class PruebaMultimedia {

	public static void main(String[] args) {
		ListaMultimedia obras = new ListaMultimedia (10);//ej4 
		//ListaMultimedia 
		
		obras.add(new Película ("LA LA LAND","DAMIEN CHAZELLE", 128, Formato.DVD, "RYAN GOSLING", "EMMA STONE"));
		obras.add(new Película ("LIBRO DE LA SELVA","YO MISMA", 105, Formato.AVI, null, null));
		obras.add(new Película ("TITANIC","JAMES CAMERON", 195, Formato.MP3, "LEO DI CAPRIO","KATE WINSLET"));
		obras.add(new Película ("VIUDA NEGRA","MARVEL", 132, Formato.MOV, null, "SCARLETT JOHANSSON"));
		obras.add(new Película ("IRON MAN","MARVEL", 126, Formato.MPG, "ROBERT DOWNEY JR", null));		
		obras.add(new Película ("HARRY POTTER 3","ALFONSO CUARÓN", 141, Formato.DVD, "DANIEL RADCLIFFE", null));
		obras.add(new Película ("PIRATAS DEL CARIBE","GORE VERBINSKI", 143, Formato.AVI, "JOHNNY DEPP", "ORLANDO BLOOM"));
		obras.add(new Película ("GREEN BOOK","PETER FARRELLY", 130, Formato.MPG, "VIGGO MORTENSEN", "MAHERSHALA ALI"));
		obras.add(new Película ("CRIADAS Y SEÑORAS","TATE TAYLOR", 146, Formato.MP3, "VIOLA DAVIS", "EMMA STONE"));
		obras.add(new Película ("ENOLA HOLMES","NETFLIX", 123, Formato.MOV, null, "MILLIE BOBBY BROWN"));
		
		//System.out.println(obras.toString());
		obras.sort();
		System.out.println(obras);

	}

}
