package org.ip.sesion05;

public class MatricesBinarias {

	public static boolean esBinaria(int[][] matriz) {

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length; j++) {

				if (matriz[i][j] != 0 && matriz[i][j] != 1) {

					return false;

				}
			}
		}

		return true;

	}

	public static int[][] transformaBinaria(int[][] matriz) {

		int[][] matrizAux = new int[matriz.length][matriz.length];

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length; j++) {

				if (matriz[i][j] % 2 == 0) {

					matrizAux[i][j] = 0;

				} else if (matriz[i][j] % 2 == 1) {

					matrizAux[i][j] = 1;
				}
			}

		}

		return matrizAux;

	}

	public static int numeroDeUnos(int[][] matriz) {

		int num1s = 0;

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length; j++) {

				if (matriz[i][j] == 1) {

					num1s++;
				}
			}
		}

		return num1s;
	}

	public static boolean tieneNumeroParCeros(int[][] matriz) {

		int num0s = 0;

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length; j++) {

				if (matriz[i][j] == 0) {

					num0s++;
				}
			}

			if (num0s % 2 == 0 && num0s != 0) {

				return true;

			}
		}

		return false;
	}

	public static int[] sumaFilas(int[][] matriz) {

		int[] arraySumaFilas = new int[matriz.length];

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length; j++) {

				arraySumaFilas[i] += matriz[i][j];

			}
		}

		return arraySumaFilas;
	}

	public static int[] sumaColumnas(int[][] matriz) {

		int[] arraySumaColumnas = new int[matriz.length];

		for (int c = 0; c < matriz[0].length; c++) {

			for (int f = 0; f < matriz.length; f++) {

				arraySumaColumnas[c] += matriz[f][c];
			}
		}

		return arraySumaColumnas;
	}

	public static int[] extraerFila(int[][] matriz, int numFila) {

		int[] arrayFilas = new int[matriz.length];

		for (int j = 0; j < matriz.length; j++) {

			arrayFilas[j] = matriz[numFila][j];
		}

		return arrayFilas;
	}

	public static int[] extraerColumna(int[][] matriz, int numColumna) {

		int[] arrayColumnas = new int[matriz.length];

		for (int i = 0; i < matriz.length; i++) {

			arrayColumnas[i] = matriz[i][numColumna];

		}

		return arrayColumnas;

	}

	public static int[][] obtenerLaterales(int[][] matriz) {

		int[] array;
		int[][] matrizLaterales = new int[4][matriz.length];

		for (int i = 0; i < matriz.length; i++) {

			switch (i) {

			case 0:

				array = extraerFila(matriz, 0);

				for (int j = 0; j < matriz.length; j++) {

					matrizLaterales[i][j] = array[j];

				}

				break;

			case 1:

				array = extraerColumna(matriz, 4);

				for (int j = 0; j < matriz.length; j++) {

					matrizLaterales[i][j] = array[j];

				}

				break;

			case 2:
				
				array = extraerFila(matriz, 4);
				
				for (int j = 0; j < matriz.length; j++) {
					
					matrizLaterales[i][j] = array[j];
				}
				break;
			case 3:
				array = extraerColumna(matriz, 0);
				for (int j = 0; j < matriz.length; j++) {
					matrizLaterales[i][j] = array[j];
				}
				break;

			}
		}

		return matrizLaterales;
	}

	public static void mostrarMatriz(int[][] matriz) {
		
		System.out.println("Matriz: ");
		System.out.print("[");
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				System.out.print(matriz[i][j]);
				
				if (j < matriz[0].length - 1) {
					
					System.out.print("\t");
					
				}
			}
			
			if (i != matriz.length - 1) {
				
				System.out.println();
				
			}

		}
		
		System.out.println("]");
		
	}

	public static void mostrarArray(int[] array) {
		
		System.out.print(" Array: ");
		System.out.print("[");
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i]);
			
			if (i < array.length - 1) {
				
				System.out.print("\t");
				
			}
		}
		
		System.out.println("]");
		
	}

	public static void main(String[] args) {
		
		int[][] matriz = { { 1, 3, 5, 7, 9 }, { 12, 8, 37, 50, 11 }, { 2, 4, 6, 8, 10 }, { 77, 12, 21, 31, 28 },{ 47, 2, 84, 87, 63 } };
		int[][] t;
		int numFila = 2;
		int numColumna = 3;
		
		mostrarMatriz(matriz);
		
		if (esBinaria(matriz)) {
			
			System.out.println("La matriz es binaria");
			
		} else {
			
			System.out.println("La matriz no es binaria");
			
		}
		
		System.out.print("Fila " + numFila + " =>");
		mostrarArray(extraerFila(matriz, numFila));
		System.out.print("Columna " + numColumna + " =>");
		mostrarArray(extraerColumna(matriz, numColumna));
		System.out.print("Suma de las filas =>");
		mostrarArray(sumaFilas(matriz));
		System.out.print("Suma de las columnas =>");
		mostrarArray(sumaColumnas(matriz));
		System.out.println("Transformando la matriz de enteros en matriz binaria ...");
		
		t = transformaBinaria(matriz);
		mostrarMatriz(t);
		if (esBinaria(t)) {
			System.out.println("La matriz es binaria");
		} else {
			System.out.println("La matriz no es binaria");
		}
		System.out.println("El numero de 1s es: " + numeroDeUnos(t));
		if (tieneNumeroParCeros(t)) {
			System.out.println("La matriz binaria tiene un numero par de ceros");
		}
		numFila = 3;
		numColumna = 2;
		System.out.print("Fila " + numFila + " =>");
		mostrarArray(extraerFila(t, numFila));
		System.out.print("Columna " + numColumna + " =>");
		mostrarArray(extraerColumna(t, numColumna));
		System.out.print("Suma de las filas =>");
		mostrarArray(sumaFilas(t));
		System.out.print("Suma de las columnas =>");
		mostrarArray(sumaColumnas(t));
		System.out.print("Laterales => ");
		mostrarMatriz(obtenerLaterales(t));
	}
}