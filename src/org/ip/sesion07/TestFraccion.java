package org.ip.sesion07;

import java.util.*;

public class TestFraccion {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Cuantas comparaciones de fracciones deseas realizar?");
		
		int ncomp = sc.nextInt();
		
		for(int i = 1; i-1 < ncomp; i++) {
			
			System.out.println("Comparacion " + i );
			System.out.println("Introduce numerador y denominador de la primera fraccion");
			
			Fraccion fraccion1 = new Fraccion(sc.nextInt(), sc.nextInt());
			
			System.out.println("Introduce numerador y denominador de la segunda fraccion");
			
			Fraccion fraccion2 = new Fraccion(sc.nextInt(), sc.nextInt());
			
			if(fraccion1.compareTo(fraccion2)==1) {
				
				System.out.println((fraccion1+ " es mayor que " +fraccion2));
				System.out.println();
				
			} if(fraccion1.compareTo(fraccion2)==0) {
				
				System.out.println((fraccion1+ " es igual que " +fraccion2));
				System.out.println();
			
			} if(fraccion1.compareTo(fraccion2)==-1) {
			
				System.out.println((fraccion1+ " es menor que " +fraccion2));
				System.out.println();
				
			}
		}
		
		sc.close();
		
	}
}
