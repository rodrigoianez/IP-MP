package org.mp.sesion01;

/**
 * Clase que crea una clase de tipo fraccion, implementa interfaz.
 * comparable y permite operaciones entre si.
 * 
 * @author Rodrigo Iáñez Huertas
 * @version 2022-12 (4.26.0)
 */

public class Fraccion implements Comparable<Object> {

	private int numerador;
	private int denominador;

	/**
	 * Constructor de fraccion que crea la fraccion 0/1.
	 */
	
	public Fraccion() {
		numerador = 0;
		denominador = 1;
	}

	/**
	 * Constructor de fraccion genérico.
	 * Obliga a que el valor negativo de la fraccion esté en el numerador.
	 * 
	 * @param numerador 	numerador del objeto de la clase fraccion.
	 * @param denominador	denominador del objeto de la  clase fraccion.
	 */
	
	public Fraccion(int numerador, int denominador) {

		this.numerador = ((denominador > 0) ? 1 : -1) * numerador;	// El numerador no puede ser menor que 0.
		this.denominador = Math.abs(denominador);

	}

	/**
	 *	Método equals sobre el objeto.
	 *
	 */
	
	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Fraccion))
			return false;
		Fraccion otro = (Fraccion) obj;
		if (denominador != otro.denominador)
			return false;
		if (numerador != otro.numerador)
			return false;
		return true;
	}
	
	/*
	 * Método que devuelve el numerador.
	 * 
	 * @return numerador.
	 * 
	 */

	public int getNumerador() {
		return numerador;
	}

	/*
	 * Método que devuelve el denominador.
	 * 
	 * @return denominador.
	 * 
	 */
	
	public int getDenominador() {
		return denominador;
	}

	/**
	 *Método que indica lo que hay que impirimir por pantalla y su formato.
	 *
	 */
	
	@Override
	public String toString() {
		if (denominador == 1)
			return numerador + "";	// Si el senominador es 1, devuelve el numerador.
		else
			return numerador + "/" + denominador;	// En cualquier otro caso, devuelve numerador/denominador.
	}

	/**
	 * Método que suma dos objetos de la clase fraccion.
	 * 
	 * @param b Objeto de la clase fraccion que se pasa como parámetro.
	 * @return	Nuevo objeto de la clase fraccion con el valor de la suma de abas fracciones.
	 * 
	 */
	
	public Fraccion sumar(Fraccion b) {
		int num = numerador * b.getDenominador() + denominador * b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);

	}

	/**
	 * Método que resta dos objetos de la clase fracción.
	 * 
	 * @param b Objeto de la clase fracción que se pasa por parámetros.
	 * @return	Nuevo objeto de la clase fracción con el vaor de la resta de ambas fracciones.
	 */
	
	public Fraccion restar(Fraccion b) {
		int num = numerador * b.getDenominador() - denominador * b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);
	}

	/**
	 * Método que multiplica dos objetos de la calse fracción.
	 * 
	 * @param b Objeto de la clase fracción que se pasa por parámetros.
	 * @return	Nuevo objeto de la calse fracción con el valor de la multiplicación de ambas fracciones.
	 */
	
	public Fraccion multiplicar(Fraccion b) {
		return new Fraccion(numerador * b.getNumerador(), denominador * b.getDenominador());
	}

	/**
	 * Método que divide dos objetos de la calse fracción.
	 * 
	 * @param b Objeto de la calse fración que se pasa por parámetros.
	 * @return	Nuevo objeto de la clase fracción con el valor de la división de abas fracciones.
	 * 
	 */
	
	public Fraccion dividir(Fraccion b) {
		return new Fraccion(numerador * b.getDenominador(), denominador * b.getNumerador());
	}

	/**
	 * 
	 * Método que obtiene el maximo común divisor de dos numeros.
	 * 
	 * @param u	Primer numero del tipo int que se pasa por parámetros.
	 * @param v Segundo numero del tipo into que se pasa por parámetros.
	 * @return Máximo común divisor entre u y v.
	 */
	
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

	/**
	 * Método que simplifica un objeto de la clase fracción.
	 * 
	 * @return Objeto de la calse fracción simplificado.
	 */
	
	public Fraccion simplificar() {
		int dividir = mcd(numerador, denominador);
		numerador /= dividir;
		denominador /= dividir;
		return this;
	}

	/**
	 * Método que declara el valor de dos objetos de la.
	 * clase fracción y las compara entre si. 
	 *
	 */
	
	public int compareTo(Object o) {

		Fraccion otro = (Fraccion) o;

		double valorFraccion = (double) numerador / denominador;
		double valorOtro = (double) otro.getNumerador() / otro.getDenominador();

		if (valorFraccion > valorOtro)	//Si el valor de la primera fraccion es mayor que el de la segunda, devuelve 1.
			return 1;
		else if (valorFraccion < valorOtro)	// Si el valor de la primera fraccion es menor que el de la segunda, devuelve 1.
			return -1;
		else
			return 0;	//Si ambos vaores son iguales, devuelve 0.

	}
	
}
