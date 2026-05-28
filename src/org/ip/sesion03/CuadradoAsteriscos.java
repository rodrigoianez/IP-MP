package org.ip.sesion03;

import java.util.Scanner;

public class CuadradoAsteriscos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int lado;
		int fila;
		int posicion;

		lado = sc.nextInt();

		System.out.print("Cuadrado de asteriscos de lado = " + lado);
		System.out.println(" ");

		for (fila = 0; fila < lado; fila++) {

			for (posicion = 0; posicion < lado; posicion++) {

				System.out.print(" *");

			}
			System.out.println(" ");
		}

		sc.close();

	}
}