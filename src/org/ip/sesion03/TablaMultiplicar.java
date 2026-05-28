package org.ip.sesion03;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {

		int valor;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Introduzca un numero (de 1 a 10): ");

			valor = sc.nextInt();
		} while (valor < 1 || 10 < valor);

		sc.close();

		System.out.println("\nTabla del " + valor + "\n");

		for (int i = 1; i <= 10; i++) {

			System.out.println(" " + valor + " x " + i + " = " + valor * i);
		}

	}
}
