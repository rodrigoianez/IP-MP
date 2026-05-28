package org.mp.sesion01;

/**
 *Clase que deterina el entero máximo de un Array.
 * 
 *@author Rodrigo Iáñez Huertas.
 *@version 2022-12 (4.26.0)
 */
public class Mayor {
	
	/**
	 * Método que determina el entero máximo de un array.
	 * 
	 * @param a	Array de numeros enteros.
	 * @return El entero mayor.
	 */	
	public static int elEnteroMayor(int[] a) {
		
		int max = Integer.MIN_VALUE;
		
		if (a.length == 0) {
			throw new RuntimeException("Array vacio");
		}
			
		for (int indice = 0; indice < a.length; indice++) {
			
				if (a[indice] > max) {
					max = a[indice];
					
				}
			}
			
			return max;
			
		} 
}