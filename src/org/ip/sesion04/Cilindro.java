package org.ip.sesion04;

import java.util.Scanner;

public class Cilindro {

	public static void main(String[] args) {

		int opcion = 0;

		double r;

		double h;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.print("Introduzca radio: ");

			r = sc.nextDouble();

		} while (r < 0);

		do {

			System.out.print("Introduzca altura: ");

			h = sc.nextDouble();

		} while (h < 0);

		System.out.println("Que desea calcular: 1 (area) / 2 (volumen): ");

		opcion = sc.nextInt();

		if (opcion == 1) {

			areaCilindro(r, h);

		} else if (opcion == 2) {

			volumenCilindro(r, h);

		} else {

			System.out.println("Opción del cálculo errónea");

		}

		sc.close();
	}

	private static void volumenCilindro(double r, double h) {

		double volumen = Math.PI * (r * r) * h;

		System.out.println("El volumen del cilindro es de: " + volumen);

	}

	private static void areaCilindro(double r, double h) {

		double area = 2 * Math.PI * r * (h + r);

		System.out.println("El area del cilindro es de: " + area);

	}

	public static void volumenCilindro(double r, int h) {

	}
}
