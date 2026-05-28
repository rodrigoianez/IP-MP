package org.ip.sesion01;

public class CalculoIntereses {
	
	public static void main(String[] args) {

		double ingresado = 2500.00;
		double interesSemestral = (ingresado * (1.75 / 100) * 0.5);
		double retencion = interesSemestral * 0.21;
		double intereses = interesSemestral - retencion;

		System.out.print("***Calculo De Intereses***\nDinero ingresado: ");
		System.out.printf("%.2f", +ingresado);
		System.out.print("€ \nInterés anual: 1.75% Interés a los 6 meses: ");
		System.out.printf("%.2f", +interesSemestral);
		System.out.print("€ \nRetención realizada: ");
		System.out.printf("%.2f", +retencion);
		System.out.print("€ \nIntereses cobrados: ");
		System.out.printf("%.2f", +intereses);
		System.out.print("€");

	}
}
