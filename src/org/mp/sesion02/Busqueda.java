package org.mp.sesion02;

public class Busqueda {
	
	public static <E extends Comparable> int busquedaBinaria(E[] a, E clave) throws ExcepcionArrayVacio{
		
		if(a.length==0) throw new ExcepcionArrayVacio();
		
		int primero = 0;
		int ultimo = a.length-1;
		int central;
		
		if(clave.compareTo(a[0]) == -1 || clave.compareTo(a[a.length-1]) == 1) {
			
			return -1;
			
		} else {
			
			while (ultimo>=primero) {
				
				central = (primero + ultimo) / 2;
				
				if(clave.compareTo(a[central]) < 0 ) {
					
					ultimo = central - 1;
				
				} else if (clave.compareTo(a[central]) > 0 ) {
					
					primero = central + 1;
					
				} else 
					
					return central;
			
			}
			
			return -1;
		}
		
	}

}
