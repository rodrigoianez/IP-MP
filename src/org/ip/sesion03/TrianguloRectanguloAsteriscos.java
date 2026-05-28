package org.ip.sesion03;

import java.util.*;

public class TrianguloRectanguloAsteriscos {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System. in);
		
		int lado = sc.nextInt();
		
		int pos;

		System.out.println("Triangulo de asteriscos de lado " + lado);
		
		System.out.println();
		
		for (int fila = lado; fila >= 0; fila--) {
			
			for (pos = 0; pos <= fila; pos++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}