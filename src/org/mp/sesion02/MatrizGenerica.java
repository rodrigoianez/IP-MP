package org.mp.sesion02;

public abstract class MatrizGenerica<E extends Number> {

	protected abstract E sumar(E o1, E o2);

	protected abstract E multiplicar(E o1, E o2);

	protected abstract E cero();

	protected E[][] sumarMatrices(E[][] matriz1, E[][] matriz2) {
		if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length)
			throw new RuntimeException("Las matrices no tienen el mismo tamaño");
		E[][] suma = (E[][]) new Number[matriz1.length][matriz1[0].length];
		for (int i = 0; i < suma.length; i++) {
			for (int j = 0; j < suma[i].length; j++) {
				suma[i][j] = sumar(matriz1[i][j], matriz2[i][j]);
			}
		}
		return suma;
	}

	
	protected E[][] multiplicarMatrices(E[][] matriz1, E[][] matriz2) {
		if (matriz1[0].length != matriz2.length)
			throw new RuntimeException("No coinciden las columnas de la primera matriz con las filas de la segunda");	
			E[][] producto = (E[][]) new Number[matriz1.length][matriz2[0].length];
			for (int i = 0; i < producto.length; i++) {
				for (int j = 0; j < producto[i].length; j++) {
					producto[i][j] = cero();
					for (int k = 0; k < producto[0].length; k++) {
						producto[i][j] = sumar(producto[i][j], multiplicar(matriz1[i][k], matriz2[k][j]));
				}
			}
		}
		return producto;
	}
	
	
}
