package Multimedia;


public class PruebaMultimedia {

	public static void main(String[] args) {
		ListaMultimedia obras = new ListaMultimedia (10);//ej4 
		//ListaMultimedia 
		
		obras.add(new Película ("LA LA LAND","Damien Chazelle", 2.8, Formato.DVD, "RYAN GOSLING", "EMMA STONE"));
		obras.add(new Película ("LIBRO DE LA SELVA","Disney", 1.29, Formato.AVI, null, null));
		obras.add(new Película ("TITANIC","James Cameron", 3.30, Formato.MP3, "LEO DI CAPRIO","KATE WINSLET"));
		obras.add(new Película ("VIUDA NEGRA","Marvel", 2.13, Formato.MOV, null, "SCARLETT JOHANSSON"));
		obras.add(new Película ("IRON MAN","Marvel", 2.6, Formato.MPG, "ROBERT DOWNEY JR", null));		
		obras.add(new Película ("HARRY POTTER 3","Alfonso Cuarón", 2.19, Formato.DVD, "DANIEL RADCLIFFE", null));
		obras.add(new Película ("PIRATAS DEL CARIBE","Disney", 2.23, Formato.AVI, "JOHNNY DEPP", "ORLANDO BLOOM"));
		obras.add(new Película ("GREEN BOOK","Peter Farrelly", 2.10, Formato.MPG, "VIGGO MORTENSEN", "MAHERSHALA ALI"));
		obras.add(new Película ("CRIADAS Y SEÑORAS","Tate Taylor", 2.26, Formato.MP3, "VIOLA DAVIS", "EMMA STONE"));
		obras.add(new Película ("ENOLA HOLMES","Netflix", 2.3, Formato.MOV, null, "MILLIE BOBBY BROWN"));
		
		//System.out.println(obras.toString());
		obras.sort();
		System.out.println(obras);
				
		//posicion 0 con 1
		for ( int i=0; i<obras.getMultimedia().length-1; i++) {
			//obras.get(i).equals(obras.get(i+1));
			System.out.println(obras.get(i).equals(obras.get(i+1)));
		}
		
		ListaMultimedia discos = new ListaMultimedia (20);
		
		discos.add(new Disco ("QUEEN","QUEEN", 38.39, Formato.MP3, Género.ROCK));
		discos.add(new Disco("BON JOVI GREATEST HITS", "BON JOVI", 55.15, Formato.CDAUDIO, Género.ROCK));
		discos.add(new Disco ("APPETITE FOR DESTRUCTION", "GUNS N ROSES", 53.55, Formato.AVI, Género.ROCK));

		System.out.println(discos.toString());
		
		Disco miDisco = new Disco("QUEEN", "QUEEN", 0, null, null);
	}

}
