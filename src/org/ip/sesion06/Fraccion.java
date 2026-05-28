package org.ip.sesion06;

public class Fraccion {

	private int numerador;
	private int denominador;
	private static int numFracciones = 0;

	public Fraccion() {
		
		numerador = 0;
		denominador = 1;
		numFracciones++;
		
	}

	public Fraccion(int numerador, int denominador) {
		
		if (denominador != 0) {
			
			this.numerador = numerador;
			this.denominador = denominador;
			numFracciones++;
			
		}
	}

	public Fraccion(Fraccion fraccion) {
		
		this.numerador = fraccion.numerador;
		this.denominador = fraccion.denominador;
		numFracciones++;
		
	}

	public int getNumerador() {
		
		return this.numerador;
		
	}

	public int getDenominador() {
		
		return this.denominador;
		
	}

	public static int getNumFracciones() {
		
		return numFracciones;
		
	}

	public String toString() {
		
		if (denominador == 1) {
			
			return numerador + " ";
			
		}
		
		return numerador + "/" + denominador;
		
	}

	public Fraccion sumar(Fraccion b) {
		
		int numerador1 = this.numerador * b.getDenominador() + this.denominador * b.getNumerador() ;
		int denominador1 = this.denominador * b.getDenominador();
		return new Fraccion(numerador1, denominador1);
		
	}

	public static Fraccion sumar(Fraccion a, Fraccion b) {
		
		int numerador1 = a.getNumerador() * b.getDenominador() +  a.getDenominador() * b.getNumerador();
		int denominador1 = a.getDenominador() * b.getDenominador();
		return new Fraccion(numerador1, denominador1);
		
	}

	public Fraccion restar(Fraccion b) {
		
		int numerador1 = this.numerador * b.getDenominador() - this.denominador * b.getNumerador();
		int denominador1 = this.denominador * b.getDenominador();
		return new Fraccion(numerador1, denominador1);
		
	}

	public Fraccion multiplicar(Fraccion b) {
		
		int numerador1 = this.numerador * b.getNumerador();
		int denoimnador1 = this.denominador * b.getDenominador();
		return new Fraccion(numerador1, denoimnador1);
		
	}

	public Fraccion dividir(Fraccion b) {
		
		int numerador1 = this.numerador * b.getDenominador();
		int deominador1 = this.denominador * b.getNumerador();
		return new Fraccion(numerador1, deominador1);
		
	}

	private static int mcd(int u, int v) {
		
		int resto;
		u = Math.abs(u);
		v = Math.abs(v);
		
		if (v == 0)
			
			return u;
		
		do {
			
			resto = u % v;
			u = v;
			v = resto;

		} while (resto != 0);
		
		return u;
		
	}

	public Fraccion simplificar() {
		
		int mcd = mcd(numerador, denominador);
		numerador /= mcd;
		denominador /= mcd;
		return this;
		
	}

	public boolean equals(Object obj) {
		
		if (!(obj instanceof Fraccion))
			
			return false;
		
		Fraccion otro = (Fraccion) obj;
		
		if (this.denominador != otro.getDenominador())
			
			return false;
		
		if (this.numerador != otro.getNumerador())
			
			return false;
		
		return true;
		
	}

}
