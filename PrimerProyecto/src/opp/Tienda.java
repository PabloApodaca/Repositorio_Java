package opp;

import java.util.Scanner;

public class Tienda {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		Cliente c1 = new Cliente();
		c1.nombre = "Juan";
		c1.apellidos = "Ramos";
		c1.comprar ();
		
		
	}

}
