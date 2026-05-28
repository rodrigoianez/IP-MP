package org.ip.sesion05;

public class PracticarConArrays {

	public static int[] invertir(int[] array) {
		int[] arrayInvertido = new int[array.length];

		for (int i = 0; i < array.length; i++) {

			arrayInvertido[(array.length - 1) - i] = array[i];

		}

		return arrayInvertido;

	}

	public static void desplazar(int[] array) {
		int auxiliar = array[0]; 

		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		
		array[array.length - 1] = auxiliar;
	}

	public static int indiceMaximoValor(int[] array) {

		int max = 0;

		for (int i = 1; i < array.length; i++) {

			if (array[i] > array[max]) {
				max = i;

			}
		}

		return max;
	}

	public static int indiceMinimoValor(int[] array) {

		int min = 0;

		for (int i = 1; i < array.length; i++) {

			if (array[min] > array[i]) {
				min = i;

			}
		}
		return min;
	}

	public static int[] eliminarDuplicados(int[] array) {

		int[] arrayAuxiliar = new int[array.length];
		arrayAuxiliar[0] = array[0];
		int indiceResultado = 1;

		for (int i = 1; i < array.length; i++) {

			boolean repetido = false;

			for (int j = i - 1; (!repetido) && (j >= 0); j--) {

				if (array[i] == array[j])
					repetido = true;

			}

			if (!repetido) {

				arrayAuxiliar[indiceResultado] = array[i];
				indiceResultado++;

			}
		}

		int[] arraySinDuplicados = new int[indiceResultado];

		for (int i = 0; i < arraySinDuplicados.length; i++)

			arraySinDuplicados[i] = arrayAuxiliar[i];

		return arraySinDuplicados;
	}

	public static void mostrarArray(int[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i]);
			
			if (i < array.length - 1) {
				
				System.out.print(", ");
				
			}
		}
	}

	public static void main(String[] args) {

		int[] array = { 5, 10, 15, 2, 4, 23, 7, 13, 8, 17, 27 };
		int[] array1 = { 1, 1, 3, 2, 1, 6, 3, 4, 4, 4, 5, 2, 1, 2, 6, 4, 7, 5, 6, 7, 1, 8 };
		
		System.out.print("Array de enteros: [");
		
		mostrarArray(array);
		
		System.out.println("]");
		System.out.println("Indice del menor valor del array de enteros: " + indiceMinimoValor(array));
		System.out.println("Indice del mayor valor del array de enteros: " + indiceMaximoValor(array));

		System.out.println("Invirtiendo el array...");
		System.out.print("Array de enteros: [");
		
		mostrarArray(invertir(array));
		
		System.out.println("]");
		System.out.println("Indice del menor valor del array invertido: " + indiceMinimoValor(invertir(array)));
		System.out.println("Indice del mayor valor del array invertido: " + indiceMaximoValor(invertir(array)));
		System.out.println("Desplazando el array original una posicion ...");
		
		desplazar(array);
		
		System.out.print("Array de enteros: [");
		
		mostrarArray(array);
		
		System.out.println("]");

		System.out.println("Desplazando el array 5 posiciones ...");
		
		for (int i = 0; i < 5; i++) {
			
			desplazar(array);
			
		}
		
		System.out.print("Array de enteros: [");
		
		mostrarArray(array);
		
		System.out.println("]");
		System.out.println("Nuevo arra con duplicados");
		System.out.print("Array de enteros: [");
		
		mostrarArray(array1);
		
		System.out.println("]");
		System.out.println("Eliminanado duplicados...");
		System.out.print("Array de enteros: [");
		
		mostrarArray(eliminarDuplicados(array1));
		
		System.out.println("]");
		System.out.println("Desplazando el array  una posicion ...");
		System.out.print("Array de enteros: [");
		
		desplazar(eliminarDuplicados(array1));
		mostrarArray(eliminarDuplicados(array1));
		
		
		System.out.println("]");

	}

}
