package org.mp.sesion02;

public class MatrizFraccion extends MatrizGenerica<Fraccion> {

	protected Fraccion sumar(Fraccion f1, Fraccion f2) {
		
		return f1.sumar(f2);
	}
	
	protected Fraccion multiplicar(Fraccion f1, Fraccion f2) {
		return f1.multiplicar(f2);
	}
		
	protected Fraccion cero() {
		return new Fraccion();
	}	
}
