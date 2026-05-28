package org.mp.sesion02;

public class Fraccion extends Number implements Comparable<Object> {

	private static final long serialVersionUID = 1L;
	
	private int numerador;
	private int denominador;

	public Fraccion() {
		numerador = 0;
		denominador = 1;
	}

	public Fraccion(int numerador, int denominador) {
		this.numerador = ((denominador > 0) ? 1 : -1) * numerador;
		this.denominador = Math.abs(denominador);
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Fraccion))
			return false;
		Fraccion otro = (Fraccion) o;
		if (denominador != otro.denominador)
			return false;
		if (numerador != otro.numerador)
			return false;
		return true;
	}

	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public String toString() {
		if (denominador == 1)
			return numerador + "";
		else
			return numerador + "/" + denominador;
	}

	public Fraccion sumar(Fraccion otra) {
		int num = numerador * otra.getDenominador() + denominador * otra.getNumerador();
		int den = denominador * otra.getDenominador();
		return new Fraccion(num, den);
	}

	public Fraccion restar(Fraccion otra) {
		int num = numerador * otra.getDenominador() - denominador * otra.getNumerador();
		int den = denominador * otra.getDenominador();
		return new Fraccion(num, den);
	}
	
	public Fraccion multiplicar(Fraccion otra) {
		return new Fraccion(numerador * otra.getNumerador(), denominador* otra.getDenominador());
	}
	
	public Fraccion dividir(Fraccion otra) {
		return new Fraccion(numerador * otra.getDenominador(),	denominador * otra.getNumerador());
	}
	
	private static int mcd(int u, int v) {
		u = Math.abs(u);
		v = Math.abs(v);
		if (v == 0) {
			return u;
		}
		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}
			
	public Fraccion simplificar() {
		int dividir = mcd(numerador, denominador);
		numerador /= dividir;
		denominador /= dividir;
		return this;
	}
			
	public int compareTo(Object o) {
		Fraccion otro = (Fraccion) o;
		double valorFraccion = (double) numerador / denominador;
		double valorOtro = (double) otro.getNumerador() /
		otro.getDenominador();
		if (valorFraccion > valorOtro)
			return 1;
		else if (valorFraccion < valorOtro)
			return -1;
		else
			return 0;
	}
	@Override
	public int intValue() {
		return (int) (numerador / denominador);
	}
	@Override
	public long longValue() {
		return (long) (numerador / denominador);
	}
	@Override
	public float floatValue() {
		return (float) numerador / denominador;
	}
	@Override
	public double doubleValue() {
		return (double) numerador / denominador;
	}
}

