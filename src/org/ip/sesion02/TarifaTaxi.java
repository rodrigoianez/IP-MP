package org.ip.sesion02;

import java.util.Scanner;

public class TarifaTaxi {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("CALCULO TARIFA TAXI");

		int km = sc.nextInt();

		if (km <= 30) {
			System.out.print("\n \nKilometros recorridos => " + km + "\nEl importe total a pagar es 18 euros");

		} else {

			if (100 > km) {
				System.out.print("\n \nKilometros recorridos => " + km + "\nEl importe total a pagar es "
						+ (18 + ((km - 30) * 0.85)) + "euros");
			} else {
				System.out.print("\n \nKilometros recorridos => " + km + "\nEl importe total a pagar es "
						+ (18 + 70 * 0.85 + ((km - 100) * 0.65)) + "euros");

			}

		}
		
		sc.close();

	}
	
	
}
