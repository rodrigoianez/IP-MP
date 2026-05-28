package org.ip.sesion05;

import java.util.Scanner;

public class EntradaSalidaArrays {
	public static double[] leerRealesArray1D() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número de elementos del array de reales");
		int numElementos = sc.nextInt();
		double[] array = new double[numElementos];
		System.out.println("Introduce valores reales en el array ");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introduce valor " + (i + 1) + "=> ");
			array[i] = sc.nextInt();

		}
		
		return array;
	}

	public static int[] leerEnterosArray1D() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número de elementos del array de enteros");
		int numElementos = sc.nextInt();
		int[] array = new int[numElementos];
		System.out.println("Introduce valores reales en el array ");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introduce valor " + (i + 1) + "=> ");
			array[i] = sc.nextInt();

		}
		
		return array;
	}

	public static int[] inicializarEnterosArray1D() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número de elementos del array de enteros");
		int numElementos = sc.nextInt();
		int[] array = new int[numElementos];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * numElementos);

		}
		return array;

	}

	public static double[] inicializarRealesArray1D() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de componentes del array de reales");
		int numElementos = sc.nextInt();
		double[] array = new double[numElementos];
		for (int i = 0; i < array.length; i++) {
			array[i] = (Math.random() * numElementos);

		}
		
		return array;

	}

	public static void mostrarArray1D(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
	}

	public static void mostrarArray1D(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
	}

	public static int[][] leerEnterosMatriz2D() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de componentes del array bidimensional de enteros");
		int numElementos = sc.nextInt();
		int[][] array = new int[numElementos][numElementos];
		System.out.println("Introduce valores enteros en el array ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("Introduce valor " + i + "," + j + ":");
				array[i][j] = sc.nextInt();

			}
		}

		return array;

	}

	public static int[][] inicializarEnterosMatriz2D() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de componentes del array bidimensional de enteros");
		int numElementos = sc.nextInt();
		sc.close();
		int[][] array = new int[numElementos][numElementos];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 9);
			}
		}

		return array;

	}

	public static void mostrarMatriz2D(int[][] matriz) {
		System.out.println("Matriz de enteros");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			
			System.out.println();
		}

	}

	public static void mostrarMatriz2D(double[][] matriz) {
		System.out.println("Matriz de reales");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}

			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		
		double matriz[][] = { { 1.0, 2.0, 3.0 }, { 3.0, 4.0, 5.0 }, { 2.5, 4.5, 8.5 } };

		leerRealesArray1D();
		leerEnterosArray1D();
		mostrarArray1D(inicializarEnterosArray1D());
		mostrarArray1D(inicializarRealesArray1D());
		leerEnterosMatriz2D();
		mostrarMatriz2D(inicializarEnterosMatriz2D());
		mostrarMatriz2D(matriz);

	}

}