package org.ip.sesion03;

import java.util.Scanner;

public class TrianguloRectanguloNumeros {

	public static void main(String[] args) {

		int lado;
		int nada;
		Scanner sc = new Scanner(System.in);

		lado = sc.nextInt();

		System.out.println("Triangulo rectangulo de numeros para un valor de lado = " + lado);
		
		System.out.println();

		for (int fila = 0; fila < lado; fila++) {

			for (nada = lado - 1; nada > fila; nada--) {

				System.out.print("  ");

			}

			for (int pos = 0; pos <= fila; pos++) {

				System.out.print(fila - pos + " ");

			}

			System.out.println();

		}

		sc.close();

	}
}