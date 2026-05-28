package org.mp.sesion02;

import java.util.*;

public class IteradorPrimos implements Iterator<Integer> {

	public int limite;
	public int actual = 2;

	public IteradorPrimos(int limite) {

		this.limite = limite;

	}

	public int getLimite() {

		return limite;

	}

	public int getActual() {

		return actual;

	}

	@Override

	public boolean hasNext() {

		return actual <= limite;

	}

	@Override
	public Integer next() {

		if (actual > limite)

			throw new NoSuchElementException("No se puede acceder a más números primos");

		int actualizador = actual;

		do {

			actual++;

		} while (!esPrimo(actual));

		return actualizador;

	}

	public void remove() {

		throw new UnsupportedOperationException("Método no soportado");

	}

	public static boolean esPrimo(int actual) {

		if (actual == 0 || actual == 1 || actual == 4) {
			return false;

		}
		for (int i = 2; i < actual / 2; i++) {

			if (actual % i == 0)
				
				return false;

		}

		return true;

	}

	public String mostrarPrimos() {

		String cadena = "";

		int i = 1;

		while (this.hasNext()) {

			if (i % 10 == 0) {

				cadena += "\t" + this.next() + "\n";

			} else {

				cadena += "\t" + this.next();

			}

			i++;

		}

		return cadena;

	}
}
