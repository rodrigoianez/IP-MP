package org.ip.sesion01;

public class ConversorEurosPesetas {
	public static void main(String[] args) {

		double euro = 131.25;
		double peseta = 3247;
		double euro2 = euro * 166.386;
		double peseta2 = peseta / 166.386;

		System.out.printf(" %.2f ",	+euro);
		System.out.printf(" euros = ");
		System.out.printf(" %.2f ",+euro2);
		System.out.printf("pesetas");

		System.out.printf("\n %.0f",+peseta);
		System.out.printf(" pesetas = ");
		System.out.printf(" %.2f ",+peseta2);
		System.out.printf("euros");

	}
}
