package org.ip.sesion04;

public class GenerarPrimos {

	public static void main(String[] args) {

		int numeros = 0;
		int numero = 2;

		System.out.print("Los 50 primeros numeros primos son: \n");

		while (numeros != 50) {

			if (esPrimo(numero) == true) {

				System.out.printf("\t" + numero);
				numeros++;
				if (numeros % 10 == 0) {
					System.out.println("");
				}

			}

			numero++;

		}
	}

	public static boolean esPrimo(int numero) {

		int i = 2;
		boolean primo = true;

		for (i = 2; i < numero; i++) {

			if (numero % i == 0) {

				primo = false;

			}

		}

		return primo;
	}
}