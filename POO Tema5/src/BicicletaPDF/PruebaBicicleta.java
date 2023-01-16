package BicicletaPDF;

public class PruebaBicicleta {

	public static void main(String[] args) {
		Bicicleta bici1 = new Bicicleta(20,4,3);		
		BicicletaMontaña bici2 = new BicicletaMontaña (15,2,2,0);
		BicicletaTandem bici3 = new BicicletaTandem (10,3,2,1);
		
		//creo array para ej7 con objetos de los tres tipos.
		Bicicleta[] bicisVarias = {bici1, bici2, bici3};
		
		/*bici2.acelerar();
		bici3.acelerar();		
		System.out.println(bici2);
		System.out.println(bici3);*/
		
		
		for (Bicicleta b : bicisVarias) {
			System.out.println("La velocidad real de "+b+" es: ");
			System.out.println(b.acelerar());
		}
		
	}//main
}//class
