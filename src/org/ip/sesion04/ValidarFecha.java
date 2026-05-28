package org.ip.sesion04;

import java.util.Scanner;

public class ValidarFecha {

	public static boolean esFechaCorrecta(int dia, int mes, int anio) {

		boolean fechaCorrecta;
		if (anio >= 1500 && anio <= 3000) {

			if ((esBisiesto(anio)) && (mes == 2 && 1 <= dia && dia <= 29)) {
				fechaCorrecta = true;
			} else if (mes == 2 && 1 <= dia && dia <= 28) {
				fechaCorrecta = true;
			} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && 1 <= dia && dia <= 30) {
				fechaCorrecta = true;
			} else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10
					|| mes == 12 && 1 <= dia && dia <= 31) {
				fechaCorrecta = true;
			} else {
				fechaCorrecta = false;
			}

		} else {
			fechaCorrecta = false;
		}
		return fechaCorrecta;
	}

	public static boolean esBisiesto(int anio) {
		if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
			return true;

		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int dia = 0;
		int mes = 0;
		int anio = 0;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Introduce el dia");
			dia = entrada.nextInt();
			System.out.println("Introduce el mes");
			mes = entrada.nextInt();
			System.out.println("Introduce el anio");
			anio = entrada.nextInt();
			if (esFechaCorrecta(dia, mes, anio) == true) {
				System.out.println("FECHA CORRECTA");
			} else {

				System.out.println("FECHA INCORRECTA, INTRODUCE NUEVOS VALORES");
			}

		} while (esFechaCorrecta(dia, mes, anio) == false);

		entrada.close();

	}

}