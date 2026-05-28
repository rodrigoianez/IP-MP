package org.ip.sesion05;

public class EstadisticasArrays {

	public static double max(double[] array) {
		double max = array[1];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static int max(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static double min(double[] array) {
		double min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

	public static int min(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

	public static double media(double[] array) {
		double media = 0;
		for (int i = 0; i < array.length; i++) {
			media += array[i] / array.length;
		}
		return media;
	}

	public static double media(int[] array) {

		double media = 0;

		for (int i = 0; i < array.length; i++) {

			media += array[i];
		}
		return media / array.length;
	}

	public static double varianza(double[] array) {
		double varianza = 0;
		for (int i = 0; i < array.length; i++) {
			varianza += (Math.pow(array[i] - media(array), 2)) / (array.length - 1);
		}
		return varianza;
	}

	public static double varianza(int[] array) {
		double varianza = 0;
		for (int i = 0; i < array.length; i++) {
			varianza += (Math.pow(array[i] - media(array), 2)) / (array.length - 1);
		}
		return varianza;
	}

	public static double desviacionTipica(double[] array) {
		double stdDev = 0;
		stdDev = Math.sqrt(varianza(array));
		return stdDev;
	}

	public static double desviacionTipica(int[] array) {
		double stdDev = 0;
		stdDev = Math.sqrt(varianza(array));
		return stdDev;
	}

	public static void mostrarArray(double[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
	}

	public static void mostrarArray(int[] array) {
		System.out.print("Array de enteros: [");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
	}

	public static void main(String[] args) {

		int[] arrayEnteros = { 5, 10, 15, 20 };
		double[] arrayDouble = { 5.0, 25.5, 15.75, 10.25, 12.5 };

		System.out.print("Array de reales: [");
		mostrarArray(arrayEnteros);
		System.out.println("]");
		System.out.print("Numero Elementos del array de enteros: ");
		System.out.println(arrayEnteros.length);
		System.out.print("Minimo del array de enteros: ");
		System.out.println(min(arrayEnteros));
		System.out.print("Maximo del array de enteros: ");
		System.out.println(max(arrayEnteros));
		System.out.print("Media del array de enteros: ");
		System.out.println(media(arrayEnteros));
		System.out.print("Varianza del array de enteros: ");
		System.out.println(varianza(arrayEnteros));
		System.out.print("Desviacion Tipica del array de enteros: ");
		System.out.println(desviacionTipica(arrayEnteros));
		System.out.println();
		System.out.print("Array de reales: [");
		mostrarArray(arrayDouble);
		System.out.println("]");
		System.out.print("Numero Elementos del array de reales: ");
		System.out.println(arrayDouble.length);
		System.out.print("Minimo del array de reales: ");
		System.out.println(min(arrayDouble));
		System.out.print("Maximo del array de reales: ");
		System.out.println(max(arrayDouble));
		System.out.print("Media del array de reales: ");
		System.out.println(media(arrayDouble));
		System.out.print("Varianza del array de reales: ");
		System.out.println(varianza(arrayDouble));
		System.out.print("Desviacion Tipica del array de reales: ");
		System.out.println(desviacionTipica(arrayEnteros));
	}
}
