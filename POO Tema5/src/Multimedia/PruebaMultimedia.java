package Multimedia;

public class PruebaMultimedia {

	public static void main(String[] args) {
		ListaMultimedia obra = new ListaMultimedia (10);
		
		obra.add(new Película ("LA LA LAND","ARANCHA C", 180, Formato.DVD, "RYAN G", "EMMA S"));
		obra.add(new Película ("LIBRO DE LA SELVA","YO MISMA", 90, Formato.AVI, "MOWGLI", "BALOO"));
		
		System.out.println(obra.toString()+"\n");
	}

}
