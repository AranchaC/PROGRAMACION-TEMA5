package FigurasPolimorfismo;

public class PruebaFiguras {

	public static void main(String[] args) {
		Rectangulo r = new Rectangulo (10,5);
		Circulo c = new Circulo(4);
		Triangulo t = new Triangulo(5,7);
		Figura[] figuras = {c, t, r};
		
		//System.out.printf("%s%n%s%n%s",c,t,r);
		for (Figura f : figuras) {
			System.out.println("perímetro de "+f+" es: ");
			System.out.println(f.perimetro());
		}

	}

}
