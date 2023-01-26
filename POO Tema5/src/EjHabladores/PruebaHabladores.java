package EjHabladores;

public class PruebaHabladores {

	public static void main(String[] args) {
		Hablador[] habladores = new Hablador[6];
		
		habladores[0] = new Loro ("Macho",2,"Europa","Azul");
		habladores[1] = new Piolin ("Macho",6,"En la ducha",6);
		habladores[2] = new Alumno ("Marta",22,"Informática",3);
		habladores[3] = new Profesor ("Jesús",35,"555-D","hola@hola.com");
		habladores[4] = new Bedel ("Dani",40,"Tarde",10);
		habladores[5] = new Tv (100,3000,28);
		
		for (Hablador h : habladores) {
			System.out.println();
			h.hablar();
		}

	}
}

