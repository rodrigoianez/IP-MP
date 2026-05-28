package org.ip.sesion03;

import java.util.*;

public class BucleCentinela {
	
	private static Scanner entrada; 
	public static void main(String[] args) { 
		int dato; 
		int contadorPositivos=0; 
		int contadorNegativos=0; 
		int sumaPositivos=0; 
		int sumaNegativos=0; 
		
		entrada = new Scanner (System.in); 
		
		System.out.println("Introduce valores enteros, el programa termina si la entrada es 0"); 
		
		dato = entrada.nextInt(); 
		
		while (dato!= 0) { 
			if (dato>0) { 
					contadorPositivos++; 
					sumaPositivos=sumaPositivos+dato; 
						} 
				else { 
					contadorNegativos++; 
						sumaNegativos+=dato; 
							} 
			
			dato = entrada.nextInt(); 
			
					} 
		
		System.out.println("El numero de positivos es " + contadorPositivos); 
		System.out.println("El numero de negativos es " + contadorNegativos); 
		System.out.println("El numero total de valores leidos es " +(contadorPositivos+contadorNegativos) ); 
		System.out.println("La suma de positivos es  " + sumaPositivos); 
		System.out.println("La suma de negativos es  " + sumaNegativos); 
		System.out.print("La media de los valores es "); 
		System.out.printf("%1.2f", +  (1.0*(sumaPositivos+sumaNegativos)/(contadorPositivos+contadorNegativos))); 
		
	} 
	
}
				


