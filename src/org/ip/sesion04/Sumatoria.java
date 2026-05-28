package org.ip.sesion04;

import java.util.*;

public class Sumatoria {
	private static Scanner entrada;

	public static int sumaIterativa(int x) {
		int suma = 0;
		for (int i = 1; i <= x; i++) {
			suma += i;
		}

		return suma;
	}

	public static int sumaDirecta(int x) {
		int suma;
		suma = (x * (x + 1)) / 2;

		return suma;
	}

	public static int sumaRecursiva(int x) {
		if (x == 1) {
			return 1;
		} else {
			return x + sumaRecursiva(x - 1);
		}

	}

	public static void main(String[] args) {
		System.out.println("Introduzca el numero de terminos que desea sumar");
		entrada = new Scanner(System.in);
		int x = entrada.nextInt();
		int suma = 0;
		System.out.println();
		System.out.print("La suma usando el metodo iterativo de los " + x + " primeros numeros es ");
		suma = sumaIterativa(x);
		System.out.println(suma);

		System.out.print("La suma usando el metodo directo de los " + x + " primeros numeros es ");
		suma = sumaDirecta(x);
		System.out.println(suma);

		System.out.print("La suma usando el metodo recursivo de los " + x + " primeros numeros es ");
		suma = sumaRecursiva(x);
		System.out.println(suma);
		System.out.println();
		if (sumaIterativa(x) == sumaDirecta(x) && sumaIterativa(x) == sumaRecursiva(x)) {
			System.out.println("Funcionamiento correcto");

		}

	}
}
