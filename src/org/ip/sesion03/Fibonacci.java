package org.ip.sesion03;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int valor;
		int suma = 1;
		int num1 = 0;
		int num2 = 1;

		System.out.print("Hasta que termino de la serie de Fibonacci quieres mostrar?");

		Scanner sc = new Scanner(System.in);
		valor = sc.nextInt();
		sc.close();
		System.out.println("0");
		for (int i = 1; i < valor + 1; i++) {

			System.out.println(suma);

			suma = num1 + num2;

			num1 = num2;
			num2 = suma;
		}

	}
}