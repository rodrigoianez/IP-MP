package org.mp.sesion05;
import java.util.Arrays;

public class Ordenacion {
	
	@SuppressWarnings("rawtypes")
	public static  void ordenacionPorInsercion(Comparable[] a) {
		ordenacionPorInsercion(a,0,a.length-1);
	}
	@SuppressWarnings("rawtypes")
	private static void ordenacionPorInsercion(Comparable[] a,int izq,int der) {
		for(int i=izq+1;i<=der;i++) {
			Comparable aux=(Comparable) a[i];
			int j;
			for(j=i;j>izq&&aux.compareTo((Comparable)a[j-1])<0;j--) {
				a[j]=a[j-1];
			}
			a[j]=aux;
		}
	}

	public static void mergeSort(Comparable []a) {
		Comparable [] vectorTemp = new Comparable [a.length];
		mergeSort(a, vectorTemp , 0 , a.length-1);
	
	}

	private static void mergeSort(Comparable[] a, Comparable[] vectorTemp, int izq, int der) {
		if(izq < der) { 
			int centro = (izq + der) / 2;
			mergeSort (a, vectorTemp , izq , centro);
			mergeSort(a, vectorTemp, centro + 1, der);
			mezclar (a, vectorTemp , izq , centro +1 , der);	
		}
	}
	
	
	
	private static void mezclar(Comparable[] a, Comparable[] vectorAux, int posIzq, int posDer, int posFin) {
		int finIzq = posDer - 1;
		int posAux = posIzq;		
		int numElementos = posFin - posIzq + 1;
		while((posIzq <= finIzq) && (posDer <= posFin)){
				if(a[posIzq].compareTo(a[posDer]) <= 0) 
					vectorAux[posAux++] = a[posIzq++];
				else
					vectorAux[posAux++] = a[posDer++];
			}
	
		while (posIzq <= finIzq) 
			vectorAux[posAux++] = a[posIzq++];
		
		while (posDer <= posFin)
			vectorAux[posAux++] = a[posDer++];
		
		for(int i = 0; i < numElementos; i++, posFin--) 
			a[posFin] = vectorAux[posFin];
	}
	
	public static void sort(Comparable [] a) {
		System.out.println("xulo");
		Arrays.sort(a); 
			
	}
	}
