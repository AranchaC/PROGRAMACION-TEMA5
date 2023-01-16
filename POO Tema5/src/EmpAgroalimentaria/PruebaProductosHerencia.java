package EmpAgroalimentaria;

public class PruebaProductosHerencia {

	public static void main(String[] args) {
		ProdFresco prod1 = new ProdFresco ("Huevos", "20-02-2023", "10-01-2023", "España", 132 );
		ProdFresco prod2 = new ProdFresco ("Espinacas", "20-01-2023", "12-01-2023", "España", 125 );
		ProdFresco prod3 = new ProdFresco ("Aguacates", "19-01-2023", "13-01-2023", "España", 184 );
		ProdRefrigerado prod4 = new ProdRefrigerado ("Filetes Pollo", "24-01-2023", "15-01-2023", "España", 120, 1.20, 1478 );
		ProdRefrigerado prod5 = new ProdRefrigerado ("Queso Curado", "20-03-2023", "09-01-2023", "España", 204, 2.12, 1456);
		ProdRefrigerado prod6 = new ProdRefrigerado ("Guacamole", "15-02-2023", "10-01-2023", "Dinamarca", 198, 1.50, 1236 );
		CongePorAgua prod7 = new CongePorAgua ("Pizza", "25-10-2023", "02-01-2023", "Francia", 157, -8.11, 3.1 );
		CongePorAgua prod8 = new CongePorAgua ("Fingers Pollo", "15-11-2023", "10-12-2022", "Italia", 241, -5.10, 2.5 );
		CongePorAire prod9 = new CongePorAire ("Patatas Fritas", "20-12-2023", "18-10-2022", "Alemania", 541, -4.22, 2, 6, 4 ,8 );	
		CongePorAire prod10 = new CongePorAire ("Gambas", "15-10-2023", "26-11-2022", "Noruega", 753, -5.15, 3, 5, 9, 4 );	
		CongePorNitrógeno prod11 = new CongePorNitrógeno ("Helado Chocolate", "21-11-2023", "10-10-2022", "Portugal", 456, -8.10, 25 );
	
		Producto [] productosTodos = {prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8, prod9, prod10, prod11};
		
		for (Producto a : productosTodos) {
			System.out.println(a.toString()+"\n");
		}
	
	}

}
