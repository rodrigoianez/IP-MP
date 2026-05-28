package org.mp.sesion04;

import java.util.*;

public class Evaluador {
	
	private GenericStack<Integer> pila;

	public Evaluador() {
		pila = new GenericStack<Integer>();
	}

	public String[] eliminarBlancos(String expresion) {
		StringTokenizer token = new StringTokenizer(expresion, "+*-/ ", true);
		GenericQueue<String> cola = new GenericQueue<>();
		while (token.hasMoreTokens()) {
			String temporal = token.nextToken();
			if (!temporal.equals(" "))
				cola.enqueue(temporal);
		}
		String[] resultado = new String[cola.getSize()];
		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = cola.dequeue();
		}
		return resultado;
	}

	public void procesarUnOperador(char op, GenericStack<Integer> operandosPila) {
		Integer segundo = operandosPila.pop();
		Integer primero = operandosPila.pop();
		Integer resultado = new Integer(0);
		switch (op) {
		case '+':
			resultado = primero + segundo;
			break;
		case '-':
			resultado = primero - segundo;
			break;
		case '*':
			resultado = primero * segundo;
			break;
		case '/':
			if (segundo == 0)
				throw new RuntimeException("No es posible una división por cero");
			resultado = primero / segundo;
			break;
		}
		operandosPila.push(resultado);
	}

	public int evaluarExpresion(String expresion) {
		String[] eliminarBlancos = eliminarBlancos(expresion);
		String soloDigitos = "";
		String token = "";
		for (int i = 0; i < eliminarBlancos.length; i++) {
			soloDigitos += eliminarBlancos[i];
		}
		if (soloDigitos(soloDigitos))
			pila.push(new Integer(soloDigitos));
		else {
			for (int i = 0; i < eliminarBlancos.length; i++) {
				token = eliminarBlancos[i];
				if (esOperador(token)) {
					char operador = token.charAt(0);
					procesarUnOperador(operador, pila);
				} else
					pila.push(new Integer(token));
			}
		}
		return pila.pop().intValue();
	}

	private boolean soloDigitos(String expresion) {
		for (int i = 0; i < expresion.length(); i++) {
			if (!Character.isDigit(expresion.charAt(i)))
				return false;
		}
		return true;
	}

	private boolean esOperador(String token) {
		return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
	}
}
