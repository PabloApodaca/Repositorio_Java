package edu.ucjc.javagrado.arrrays;

public class PruebaArrays {

	public static void main(String[] args) {
		
		// Arrays, matrices o arreglos
		String [] colores = {"Blanco","Azul","Rojo"};
		//syso
		System.out.println(colores[1]);
		
		for ( int i=0; i<colores.length ; i++ ) {
			System.out.println(colores[i]);			
		}

		//fore
		for( String color : colores) {
			System.out.println(color);
		}
		
	}

}
