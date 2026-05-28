package org.ip.sesion03;

import java.util.Scanner;

public class Primo {
	
	public static void main(String[] args) {

			Scanner sc= new Scanner (System. in);
			
			int valor;
			boolean primo=true;
					
		do {
			System.out.print("Introduce un numero (>1) para saber si es primo: ");
			
			valor=sc.nextInt();
			
		}while(valor<=1);
		
		for(int i=2;i<valor;i++) {
			
				if(valor%i==0) {
					
					primo=false;
					
				}
				
				sc.close();
						
		}
				
		if(primo) {
			
					
			System.out.println("ES PRIMO")	;
				
		}else {

			System.out.println("NO ES PRIMO");
				
		}
				
	}
}
	
