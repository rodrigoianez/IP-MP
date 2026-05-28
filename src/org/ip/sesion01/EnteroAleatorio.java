package org.ip.sesion01;

public class EnteroAleatorio {
	
	public static void main(String[] args) {

		int valorEntero = (int) Math.floor(Math.random() * (15 - (-15) + 1) + (-15));

		System.out.println("Vamos a generar un entero aleatorio entre -15 y 15." + "\nEl número entero generado es: "
				+ valorEntero);
	}

}
