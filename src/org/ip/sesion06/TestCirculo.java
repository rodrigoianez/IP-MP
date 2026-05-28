package org.ip.sesion06;

import java.util.Locale;
import java.util.Scanner;

public class TestCirculo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		System.out.println("*** Programa que permite trabajar con circulos ***");
		System.out.println();
		
		Circulo circ1 = new Circulo(1.0, 1.0, 1.0);
		Circulo circ2 = new Circulo();
		Circulo circ3 = new Circulo(0.0, 0.0);
		Circulo circ4 = new Circulo(circ3);
		
		
		System.out.println("Circulo 1 " + circ1.toString());
		System.out.println("Circulo 2 " + circ2.toString());
		System.out.println("Circulo 3 " + circ3.toString());
		System.out.println("Circulo 4 " + circ4.toString());
		
		if (circ1.equals(circ2))
			
			System.out.println("Circulos 1 y 2 son iguales");
		
		else
			System.out.println("Circulos 1 y 2 son distintos");
		
		if (circ2.equals(circ3) && circ2.equals(circ4))
			
			System.out.println("Circulos 2, 3 y 4 son iguales");
		
		else
			
			System.out.println("Circulos 2, 3 y 4  son distintos");
			System.out.println("El numero de circulos creados es " + Circulo.getNumCirculos());
			
		if (circ1.compareTo(circ2) == 0) {
			
			System.out.println("Circulos 1 y 2 son iguales en area");
			
		} else if (circ1.compareTo(circ2) == 1)
			
			System.out.println("Circulo 1 es mas grande que el circulo 2 en area");
		
		else if (circ1.compareTo(circ2) == -1)
			
			System.out.println("Circulo 1 es mas pequenio que el circulo 2 en area");
			System.out.println("Circulo 1 => [<area>=" + circ1.calcularArea() + ", " + "<diametro>="+ circ1.calcularDiametro() + ", " + "<longitud>=" + circ1.calcularLongitud() + "]");
			System.out.println("Indica las coordenadas del punto P(x, y) centro de un nuevo circulo");
			
			double xCentro = sc.nextDouble();
			double yCentro = sc.nextDouble();
			
			System.out.println("Introduce el valor del radio del nuevo circulo");
			
			double radio = sc.nextDouble();
			Circulo circ5 = new Circulo(xCentro, yCentro, radio);
			
			System.out.println("Circulo 5 " + circ5.toString());
			System.out.println("Circulo 5 => [<area>=" + circ5.calcularArea() + ", " + "<diametro>=" + circ5.calcularDiametro() + ", " + "<longitud>=" + circ5.calcularLongitud() + "]");
			System.out.println("El numero de circulos creados es " + Circulo.getNumCirculos());
		
		sc.close();
	}
}
