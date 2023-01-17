package Multimedia;

public class PruebaMultimedia {

	public static void main(String[] args) {
		ListaMultimedia obra = new ListaMultimedia (10);
		
		obra.add(new Película ("LA LA LAND","DAMIEN CHAZELLE", 180, Formato.DVD, "RYAN G", "EMMA S"));
		obra.add(new Película ("LIBRO DE LA SELVA","YO MISMA", 90, Formato.AVI, "MOWGLI", "BALOO"));
		obra.add(new Película ("TITANIC","JAMES CAMERON", 120, Formato.MP3, "LEO DI CAPRIO","KATE WINSLET"));
		
		System.out.println(obra.toString()+"\n");
	}

}
