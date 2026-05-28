package org.ip.sesion03;

import java.util.*;

public class Euclides {

	public static void main(String[] args) {

		int valor1;
		int valor2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el primer valor entero positivo");

		valor1 = sc.nextInt();
		do {

			System.out.println("Introduce el primer valor entero positivo");

			valor1 = sc.nextInt();

		} while (1 > valor1);

		do {

			System.out.println("Introduce el segundo valor entero positivo");

			valor2 = sc.nextInt();

			sc.close();

		} while (0 > valor2);

		int divisor = valor1;
		int dividendo = valor2;
		int resto;
		int MCD = 0;

		do {

			resto = dividendo % divisor;
			MCD = divisor;
			dividendo = divisor;
			divisor = resto;

		} while (resto != 0);

		System.out.print("El MCD de " + valor1 + " y " + valor2 + " es " + MCD);

	}

}
