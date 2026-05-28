package org.ip.sesion02;

import java.util.Scanner;

public class LoteDefectuoso {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el número de lote: ");
		
		 int codigo = sc.nextInt();

		if (5300 <= codigo && codigo <= 5399) {
			System.out.println("El codigo " + codigo + " " + " corresponde a un lote DEFECTUOSO");
		} else if (33001 <= codigo && codigo <= 39999) {
			System.out.println("El codigo " + codigo + " " + " corresponde a un lote DEFECTUOSO");
		} else if (178000 <= codigo && codigo <= 191400) {
			System.out.println("El codigo " + codigo + " " + " corresponde a un lote DEFECTUOSO");
		} else {
			System.out.println("El codigo " + codigo + " " + " corresponde a un lote NO DEFECTUOSO");
		}
		
		sc.close();

	}
	
}
