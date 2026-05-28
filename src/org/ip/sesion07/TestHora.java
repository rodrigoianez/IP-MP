package org.ip.sesion07;

import org.ip.sesion07.Hora12.Meridiano;

public class TestHora {

	public static void main(String[] args) {

		Hora reloj1 = new Hora(11, 30);
		Hora reloj2 = new Hora(23, 31);

		System.out.println(reloj1.toString());

		for (int i = 1; i <= 1 + 61; i++) {

			reloj1.incrementar();

		}

		System.out.println( reloj1.toString());
		System.out.println(reloj2.toString());

		for (int i = 1; i <= 1 + 61; i++) {

			reloj2.incrementar();

		}

		System.out.println(reloj2.toString());
		System.out.println();

		Hora12 reloj3 = new Hora12(11, 10, Meridiano.AM);
		Hora12 reloj4 = new Hora12(12, 11, Meridiano.AM);

		System.out.println(reloj3.toString());

		for (int i = 1; i <= 61; i++) {

			reloj3.incrementar();

		}

		System.out.println(reloj3.toString());
		System.out.println(reloj4.toString());

		for (int i = 1; i <= 80; i++) {

			reloj4.incrementar();

		}

		System.out.println(reloj4.toString());
		System.out.println();

		HoraExacta relojExacto1 = new HoraExacta(0, 0, 31);
		HoraExacta relojExacto2 = new HoraExacta(23, 1, 32);

		System.out.println("Hora exacta del reloj: " +relojExacto1.toString());

		for (int i = 1; i <= 61; i++) {

			relojExacto1.incrementar();

		}
		
		System.out.println( "Hora exacta del reloj: " + relojExacto1.toString());
		System.out.println(  "Hora exacta del reloj: " +relojExacto2.toString());
		
		for (int i = 1; i <= 4000 + 60; i++) {
			
			relojExacto2.incrementar();
			
		}
		
		System.out.println( "Hora exacta del reloj: " +relojExacto2.toString());
		System.out.println();
		
		HoraExacta momentoExacto1 = new HoraExacta(1, 2, 3);
		HoraExacta momentoExacto2 = new HoraExacta(1, 2, 3);
		HoraExacta momentoExacto3 = new HoraExacta(10, 20, 30);
		
		System.out.println("COMPROBACION DE MOMENTOS EXACTOS");
		System.out.println("Los momentos exactos son: " + momentoExacto1 + ", " + momentoExacto2 + ", " + momentoExacto3);
		
		int comp1y2 = momentoExacto1.compareTo(momentoExacto2);
		int comp1y3 = momentoExacto1.compareTo(momentoExacto3);
		int comp3y1 = -comp1y3;
		
		System.out.print( momentoExacto1);
		
		if (comp1y2 < 0) {
			
			System.out.print(" ES MENOR QUE ");
			
		}
		
		if (comp1y2 > 0) {
			
			System.out.print(" ES MAYOR QUE ");
			
		}
		
		if (comp1y2 == 0) {
			
			System.out.print(" ES IGUAL A ");
			
		}
		
		System.out.println(momentoExacto2);
		System.out.print(momentoExacto1);
		
		if (momentoExacto1.equals(momentoExacto3)) {
			
			System.out.print(" ES IGUAL A ");
			
		} else {
			
			System.out.print(" NO ES IGUAL A ");
			
		}
		
		System.out.println(momentoExacto3);
		System.out.print(momentoExacto1);
		
		if (comp1y3 < 0) {
			
			System.out.print(" ES MENOR QUE ");
			
		}
		
		if (comp1y3 > 0) {
			
			System.out.print(" ES MAYOR QUE ");
			
		}
		
		if (comp1y3 == 0) {
			
			System.out.print(" ES IGUAL A ");
			
		}
		
		System.out.println(momentoExacto3);
		System.out.print(momentoExacto3);
		
		if (comp3y1 < 0) {
			
			System.out.print(" ES MENOR QUE ");
			
		}
		
		if (comp3y1 > 0) {
			
			System.out.print(" ES MAYOR QUE ");
			
		}
		
		if (comp3y1 == 0) {
			
			System.out.print(" ES IGUAL A ");
			
		}
		
		System.out.println(momentoExacto1);
		System.out.print(momentoExacto1);
		
		if (comp1y2 < 0) {
			
			System.out.print(" ES MENOR QUE ");
			
		}
		
		if (comp1y2 > 0) {
			
			System.out.print(" ES MAYOR QUE ");
			
		}
		
		if (comp1y2 == 0) {
			
			System.out.print(" ES IGUAL A ");
			
		}
		
		System.out.println(momentoExacto2);

	}

}
