package org.ip.sesion07;

public class Fraccion implements Comparable<Object> {

	private int numerador;
	private int denominador;

	public Fraccion() {

		numerador = 0;
		denominador = 1;

	}

	public Fraccion(int numerador, int denominador) {

		if (denominador != 0) {

			if (numerador < 0 && denominador < 0) {

				this.numerador = -numerador;
				this.denominador = -denominador;

			} else {

				this.numerador = numerador;
				this.denominador = denominador;

			}
		}
	}

	public Fraccion(Fraccion frac) {

		this.numerador = frac.getNumerador();
		this.denominador = frac.getDenominador();

	}

	public int getNumerador() {

		return this.numerador;

	}

	public void setNumerador(int numerador) {

		this.numerador = numerador;

	}

	public int getDenominador() {

		return this.denominador;

	}

	public void setDenominador(int denominador) {

		this.denominador = denominador;

	}

	public String toString() {

		return numerador + "/" + denominador;

	}

	public Fraccion sumar(Fraccion b) {

		int num = this.numerador * b.getDenominador() + b.getNumerador() * this.denominador;
		int den = this.denominador * b.getDenominador();
		return new Fraccion(num, den);

	}

	public static Fraccion sumar(Fraccion a, Fraccion b) {

		int num = a.getNumerador() * b.getDenominador() + b.getNumerador() * a.getDenominador();
		int den = a.getDenominador() * b.getDenominador();
		return new Fraccion(num, den);

	}

	public Fraccion restar(Fraccion b) {

		int num = this.numerador * b.getDenominador() - b.getNumerador() * this.denominador;
		int den = this.denominador * b.getDenominador();
		return new Fraccion(num, den);

	}

	public Fraccion multiplicar(Fraccion b) {

		int num = this.numerador * b.getNumerador();
		int den = this.denominador * b.getDenominador();
		return new Fraccion(num, den);

	}

	public Fraccion dividir(Fraccion b) {

		int num = this.numerador * b.getDenominador();
		int den = this.denominador * b.getNumerador();
		return new Fraccion(num, den);

	}

	private static int mcd(int u, int v) {

		int resto;
		u = Math.abs(u);
		v = Math.abs(v);

		if (v == 0)
			return u;
		while (v != 0) {
			resto = u % v;
			u = v;
			v = resto;
		}
		return u;
	}

	public Fraccion simplificar() {
		int mcd = mcd(numerador, denominador);
		numerador /= mcd;
		denominador /= mcd;
		return this;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Fraccion)) {
			return false;
		}
		Fraccion otro = (Fraccion) obj;
		if (this.denominador != otro.getDenominador())
			return false;
		if (this.numerador != otro.getNumerador())
			return false;
		return true;
	}

	public int compareTo(Object obj) {

		Fraccion otro = (Fraccion) obj;
		if ((this.numerador / (double) this.denominador) < (otro.getNumerador() / (double) otro.getDenominador()))
			return -1;
		if ((this.numerador / (double) this.denominador) > (otro.getNumerador() / (double) otro.getDenominador()))
			return 1;

		return 0;
	}

}
