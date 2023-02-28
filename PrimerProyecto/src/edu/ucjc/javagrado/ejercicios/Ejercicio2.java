package edu.ucjc.javagrado.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	

	public static void main(String[] args) {

		// Fonacci
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Introduce un numero: ");
		int numerosSerie = scan.nextInt();
		int num1 = 0, num2 = 1;
		System.out.print(num1);
		System.out.print(","+num2);
		for (int i = 0; i < numerosSerie-2; i++) {
			// primero sumamos
			int suma = num1 + num2;
			// muestro la suma
			System.out.print(suma);
			// cambiamos la segunda variable por la primera.
			num1 = num2;
			
		}
		

	}

}
