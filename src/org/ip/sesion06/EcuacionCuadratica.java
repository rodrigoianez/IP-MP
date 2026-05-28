package org.ip.sesion06;

public class EcuacionCuadratica {

	private double a;
	private double b;
	private double c;
	private static int numEcuacionesCuadraticas = 0;

	public EcuacionCuadratica(double a, double b, double c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		numEcuacionesCuadraticas++;
		
	}

	public EcuacionCuadratica(EcuacionCuadratica ecuacion) {
		
		this.a = ecuacion.getA();
		this.b = ecuacion.getB();
		this.c = ecuacion.getC();
		numEcuacionesCuadraticas++;
		
	}

	public double getA() {
		return this.a;
		
	}
	
	public void setA(double a) {
		this.a = a;
		
	}

	public double getB() {
		return this.b;
		
	}
	
	public void setB(double b) {
		this.b = b;
		
	}

	public double getC() {
		return this.c;
		
	}

	public void setC(double c) {
		this.c = c;
		
	}

	public static int getNumEcuacionesCuadraticas() {
		return numEcuacionesCuadraticas;
		
	}

	@Override
	
	public String toString() {
		
		return "Ecuacion Cuadratica: (a=" + a + ", " + "b=" + b + ", " + "c=" + c + ")";
	}

	public double getDiscriminante() {
		
		return (b * b) - 4 * a * c;
		
	}

	public double getRaiz1() {
		
		return (-b + Math.sqrt(getDiscriminante())) / (2 * a);
		
	}

	public double getRaiz2() {
		
		return (-b - Math.sqrt(getDiscriminante())) / (2 * a);
		
	}

}