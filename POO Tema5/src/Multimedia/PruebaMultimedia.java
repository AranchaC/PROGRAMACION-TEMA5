package Multimedia;

public class PruebaMultimedia {

	public static void main(String[] args) {
		ListaMultimedia obra = new ListaMultimedia (10);//ej4 
		//ListaMultimedia 
		
		obra.add(new Película ("LA LA LAND","DAMIEN CHAZELLE", 180, Formato.DVD, "RYAN GOSLING", "EMMA STONE"));
		obra.add(new Película ("LIBRO DE LA SELVA","YO MISMA", 90, Formato.AVI, null, null));
		obra.add(new Película ("TITANIC","JAMES CAMERON", 120, Formato.MP3, "LEO DI CAPRIO","KATE WINSLET"));
		obra.add(new Película ("VIUDA NEGRA","MARVEL", 130, Formato.MOV, null, "SCARLETT JOHANSSON"));
		obra.add(new Película ("IRON MAN","MARVEL", 115, Formato.MPG, "ROBERT DOWNEY JR", null));
		
		System.out.println(obra.toString());
	}

}
