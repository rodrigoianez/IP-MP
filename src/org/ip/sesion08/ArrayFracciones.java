
package org.ip.sesion08;

import java.util.Arrays;
import org.ip.sesion07.Fraccion;

public class ArrayFracciones implements Comparable<Object> {
	private Fraccion[] array;

	public ArrayFracciones(int numeroElementos) {
		super();
		this.array = new Fraccion[numeroElementos];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Fraccion();
		}
	}

	public ArrayFracciones(Fraccion[] array) {
		super();
		this.array = new Fraccion[array.length];
		for (int i = 0; i < array.length; i++) {
			this.array[i] = new Fraccion(array[i]);
		}
	}

	public ArrayFracciones(ArrayFracciones arrayFracciones) {
		super();
		this.array = new Fraccion[arrayFracciones.array.length];
		for (int i = 0; i < arrayFracciones.array.length; i++) {
			this.array[i] = new Fraccion(arrayFracciones.array[i]);
		}
	}


	public Fraccion[] getArray() {
		return array;
	}

	public void setArray(Fraccion valor) {
		for (int i = 0; i < array.length; i++) {
			array[i] = valor;
		}
	}

	public int getNumeroElementos() {
		return this.array.length;
	}

	public Fraccion getValorElemento(int posicion) {
		Fraccion fraccionPosicion = new Fraccion();
		if (posicion >= 0 && posicion <= array.length - 1) {
			fraccionPosicion = array[posicion];
			return fraccionPosicion;
		} else
			return null;
	}

	public boolean setValorElemento(int posicion, Fraccion valor) {
		if (posicion >= 0 && posicion <= array.length - 1) {
			array[posicion] = valor;
			return true;
		} else
			return false;
	}

	public Fraccion getMinimo() {
		Fraccion minimo = new Fraccion(getMaximo());
		for (int i = 0; i < array.length; i++) {
			if (array[i].compareTo(minimo) == -1)
				minimo = array[i];
		}
		return minimo;
	}

	public Fraccion getMaximo() {
		Fraccion maximo = new Fraccion();
		for (int i = 0; i < array.length; i++) {
			if (array[i].compareTo(maximo) == 1)
				maximo = array[i];
		}
		return maximo;
	}

	public Fraccion getSumaArray() {
		Fraccion suma = new Fraccion();
		for (int i = 0; i < array.length; i++) {
			suma = suma.sumar(array[i]);
		}
		suma.simplificar();
		if (suma.getNumerador() < 0 && suma.getDenominador() < 0) {
			suma.setNumerador(suma.getNumerador() * -1);
			suma.setDenominador(suma.getDenominador() * -1);
		}
		return suma;
	}

	public String toString() {
		String string = "ArrayFracciones: [";
		for (int i = 0; i < array.length; i++) {
			string += "<" + array[i] + ">";
			if (i < array.length - 1)
				string += ", ";
		}
		return string + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArrayFracciones other = (ArrayFracciones) obj;
		if (!Arrays.equals(array, other.array))

			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		ArrayFracciones otro = (ArrayFracciones) o;
		if (this.getSumaArray().compareTo(otro.getSumaArray()) == 0)
			return 0;
		else if (this.getSumaArray().compareTo(otro.getSumaArray()) == 1)
			return 1;
		else
			return -1;
	}

}
