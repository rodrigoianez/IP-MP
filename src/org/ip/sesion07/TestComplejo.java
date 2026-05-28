package org.ip.sesion07;

import java.util.Locale;
import java.util.Scanner;

public class TestComplejo {
	
		public static void main(String[] args) {
			
			Scanner sc =  new Scanner (System.in);
			sc.useLocale(Locale.ENGLISH);
			
			System.out.println("PRIMER COMPLEJO");
			System.out.println("Introduce la parte real");
			double real1 = sc.nextDouble();
			System.out.println("Introduce la parte imaginaria");
			double imaginaria1 = sc.nextDouble();
			System.out.println("SEGUNDO COMPLEJO");
			System.out.println("Introduce la parte real");
			double real2 = sc.nextDouble();
			System.out.println("Introduce la parte imaginaria");
			double imaginaria2 = sc.nextDouble();
			
			Complejo comp1 = new Complejo(real1, imaginaria1);
			Complejo comp2 = new Complejo(real2, imaginaria2);
			Complejo comp3 = new Complejo(comp2);
			
			System.out.println("LOS NUMEROS COMPLEJOS SON:");
			System.out.println("El primer numero complejo es: " + comp1.toString());
			System.out.println("El segundo numero complejo es: "+ comp2.toString());
			System.out.println("El tercer numero complejo es: "+ comp3.toString());
			
			System.out.println("\nRESULTADO DE LAS OPERACIONES");
			System.out.println("(" + comp1.toString() + ")" + " + (" + comp2.toString() + ") = " + comp1.sumar(comp2).toString());
			System.out.println("(" + comp1.toString() + ")" + " - (" + comp2.toString() + ") = " + comp1.restar(comp2).toString());
			System.out.println("(" + comp1.toString() + ")" + " * (" + comp2.toString() + ") = " + comp1.multiplicar(comp2).toString());
			System.out.println("(" + comp1.toString() + ")" + " / (" + comp2.toString() + ") = " + comp1.dividir(comp2).toString());
			System.out.println(real1 + " * (" + comp1 + ") = " + comp1.productoPorEscalar(real1).toString());
			System.out.println("|" + comp1.toString() + "| = " + comp1.modulo().toString());
			System.out.println("Argumento(" + comp1 + ") = " + comp1.argumento() + " radianes.");
			if (comp1.equals(comp2)) 
				System.out.println("El primer complejo ES IGUAL al segundo");
			 else 
				System.out.println("El primer complejo NO ES IGUAL al segundo");
			if (comp2.equals(comp3))
				System.out.println("El segundo complejo ES IGUAL al tercero");
			else 
				System.out.println("El segundo complejo NO ES IGUAL  al tercero");
			
			System.out.println();
			comp3.setReal(1.0);
			comp3.setImaginaria(-2.0);
			System.out.println("El tercer numero complejo con nuevos valores es: " + comp3.toString());
			System.out.println("Conjugado(" + comp3.toString() + ") = " +comp3.conjugado().toString());
			
			sc.close();
		}
}