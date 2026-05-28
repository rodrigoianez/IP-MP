package org.mp.sesion05;

import org.mp.sesion02.ExcepcionArrayVacio;

public class SolucionesBusqueda {

	public static Object busquedaLineal(Busqueda busqueda) throws ElementoNoEncontradoException {
		int buscado;
		buscado = busqueda.getNumBuscado();
		boolean encontrado = false;
		int[] datos = busqueda.getDatos();
		for (int i = 0; i < datos.length; i++) {
			if (buscado == datos[i]) {
				encontrado = true;
				break;
			}
		}
		if (encontrado != true)
			throw new ElementoNoEncontradoException("No encontrado");
		return buscado;
	}

	public static Object busquedaBinariaIter(Busqueda busqueda) throws ElementoNoEncontradoException {
		int[] a = busqueda.getDatos();
		int primero = 0;
		int ultimo = a.length - 1;
		int central;

		if (busqueda.getNumBuscado() < a[0] || busqueda.getNumBuscado() > a[a.length - 1])
			throw new ElementoNoEncontradoException("No encontrado");
		else {
			while (ultimo >= primero) {
				central = (primero + ultimo) / 2;
				if (busqueda.getNumBuscado() < (a[central]))
					ultimo = central - 1;
				else if (busqueda.getNumBuscado() > (a[central]))
					primero = central + 1;
				else
					return central;

			}
			throw new ElementoNoEncontradoException("No encontrado");
		}
	}

	public static Object busquedaBinariaRec(Busqueda busqueda) throws ElementoNoEncontradoException {
		int inicio = 0;
		int[] datos = busqueda.getDatos();
		int fin = datos.length - 1;
		int buscado = busqueda.getNumBuscado(); 
		busquedaBinariaRec(datos, buscado, inicio, fin);
		return buscado; 
	}

	private static void busquedaBinariaRec(int[] datos, int buscado, int inicio, int fin)
			throws ElementoNoEncontradoException {

		if (inicio > fin)
			throw new ElementoNoEncontradoException("No encontrado");

		int central = (inicio + fin) / 2;

		if (datos[central] < buscado) 
			busquedaBinariaRec(datos, buscado, central + 1, fin);

		else if (datos[central] > buscado) 
			busquedaBinariaRec(datos, buscado, inicio, central - 1);
	}

}
