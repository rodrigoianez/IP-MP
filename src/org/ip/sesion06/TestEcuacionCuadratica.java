package org.ip.sesion06;

import java.util.Scanner;

public class TestEcuacionCuadratica {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Introduce los valores de los coeficientes de la ecuacion cuadratica: ax*x + b*x + c = 0");
		System.out.print("a = ");
		
		double a=sc.nextDouble();
		
		System.out.print("b = ");
		
		double b=sc.nextDouble();
		
		System.out.print("c = ");
		
		double c=sc.nextDouble();
		
		EcuacionCuadratica ecuacion = new EcuacionCuadratica (a,b,c);
		System.out.println(ecuacion.toString());
		
		if(a==0) {
			
			System.out.println("No es una ecuación cuadratica");
			
		}
		
		else if (ecuacion.getDiscriminante() == 0) {
			
			System.out.println("Ecuacion cuadratica con una unica raiz de valor doble");
			System.out.println("x = " + ecuacion.getRaiz1());
			
		}
		
		else if (ecuacion.getDiscriminante() < 0) {
			
			System.out.println("Ecuacion cuadratica sin raices reales");
			
		}
		
		else if (ecuacion.getDiscriminante() > 0) {
			
			System.out.println("Ecuacion cuadratica con dos raices de valores");
			System.out.println("x1 = "+ecuacion.getRaiz1());
			System.out.println("x2 = "+ecuacion.getRaiz2());
			sc.close();

		}

	}
}