package org.ip.sesion04;

import java.util.Scanner;

public class PrintCalendarioConFestivos {

	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";

	public static void main(String[] args) {

		System.out.print("Introduzca un año (por ejemplo, 2001):");
		int anio = extracted().nextInt();
		System.out.print("Introduzca un mes como un numero entre 1 (enero) y 12 (diciembre): ");
		int mes = extracted().nextInt();
		printMes(anio, mes);
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

	public static void printMes(int anio, int mes) {
		printTituloMes(anio, mes);
		printCuerpoMes(anio, mes);
	}

	public static void printTituloMes(int anio, int mes) {
		System.out.println("        " + getNombreMes(mes) + " " + anio);
		System.out.println("---------------------------");
		System.out.println(" Lun Mar Mie Jue Vie Sab Dom");
	}

	public static void printCuerpoMes(int anio, int mes) {

		getDiaInicio(anio, mes);
		int dia = 1;
		getNumeroDeDiasDelMes(anio, mes);

		boolean bdia = false;

		for (int i = 0; i < 6; i++) {
			for (int j = 1; j < 8; j++) {
				if (getDiaInicio(anio, mes) == j)
					bdia = true;
				if (bdia == false) {
					System.out.print("    ");
				} else if ((j == 7) && (dia <= getNumeroDeDiasDelMes(anio, mes))) {
					System.out.print(ANSI_RED);
					System.out.printf("  %2d", dia);
					System.out.print(ANSI_RESET);
					dia++;

				} else if (mes == 1 && dia == 1 || mes == 1 && dia == 6) { // Año nuevo y Epifanía del Señor

					System.out.print(ANSI_RED);
					System.out.printf("  %2d", dia);
					System.out.print(ANSI_RESET);
					dia++;

				} else if (mes == 8 && dia == 15) { // Asunción de la virgen

					System.out.print(ANSI_RED);
					System.out.printf("  %2d", dia);
					System.out.print(ANSI_RESET);
					dia++;

				} else if (mes == 10 && dia == 12) { // Fiesta nacional

					System.out.print(ANSI_RED);
					System.out.printf("  %2d", dia);
					System.out.print(ANSI_RESET);
					dia++;

				} else if (mes == 11 && dia == 11) { // Todos los santos

					System.out.print(ANSI_RED);
					System.out.printf("  %2d", dia);
					System.out.print(ANSI_RESET);
					dia++;

				} else if (mes == 12 && dia == 6 || mes == 12 && dia == 8) { // Día de la Constitución e Inmaculada
																				// concepción

					System.out.print(ANSI_RED);
					System.out.printf("  %2d", dia);
					System.out.print(ANSI_RESET);
					dia++;

				} else if (dia <= getNumeroDeDiasDelMes(anio, mes)) {

					System.out.printf("  %2d", dia);
					dia++;
				}

			}

			System.out.println("");
		}
	}

	public static String getNombreMes(int mes) {
		String nombreMes = "";
		switch (mes) {
		case 1:
			nombreMes = "Enero";
			break;
		case 2:
			nombreMes = "Febrero";
			break;
		case 3:
			nombreMes = "Marzo";
			break;
		case 4:
			nombreMes = "Abril";
			break;
		case 5:
			nombreMes = "Mayo";
			break;
		case 6:
			nombreMes = "Junio";
			break;
		case 7:
			nombreMes = "Julio";
			break;
		case 8:
			nombreMes = "Agosto";
			break;
		case 9:
			nombreMes = "Septiembre";
			break;
		case 10:
			nombreMes = "Octubre";
			break;
		case 11:
			nombreMes = "Noviembre";
			break;
		case 12:
			nombreMes = "Diciembre";
			break;
		}
		return nombreMes;
	}

	public static int getDiaInicio(int anio, int mes) {
		int d = 1;
		int y0 = anio - (14 - mes) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = mes + 12 * ((14 - mes) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}

	public static boolean esBisiesto(int anio) {
		return (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0);
	}

	public static int getNumeroDeDiasDelMes(int anio, int mes) {
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			return 30;
		}
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			return 31;
		}
		if (mes == 2) {
			if (esBisiesto(anio)) {
				return 29;
			} else {
				return 28;
			}
		}
		return 0;

	}

}