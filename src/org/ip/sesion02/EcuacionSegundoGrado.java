package org.ip.sesion02;

public class EcuacionSegundoGrado {
	
	public static void main(String[] args) {
		
		
	System.out.print("SOLUCION DE UNA ECUACION DE SEGUNDO GRADO");
		
		int a = 1;
		int b = -3;
		int c = 2;
		double x1 =((-b+Math.sqrt((b*b)-(4*a*c)))/(2*c));
		double x2 =((-b-Math.sqrt((b*b)-(4*a*c)))/(2*c));
		
		System.out.println("\n \n 	Valores de los coeficientes");
		
		System.out.print("\n a = "+ a);
		System.out.print(", b = "+ b);
		System.out.print(", c = "+ c);
		
		
		
		if((b*b)-(4*a*c)<0) {
			System.out.println("\n No tiene solucion real");
		}
		else {
			if(a == 0) {
				System.out.println("\n No es una ecuación de segundo grado");
			}
			else {
				
				if (x1 == x2) {
					System.out.println("\n Una única raíz de valor doble\n x = "+x1);
				}
				
				else {if((b*b)-(4*a*c)>0) {
			}
		    System.out.println("\n \n Dos raíces de valores");
	      	System.out.println(" x1 = "+x1);
		    System.out.println(" x2 = "+x2);
				}
		    }
		     
			
		}
	}
}
		