package org.mp.sesion06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class ConjuntoDatos {
	private File archivoTexto;
	private String separador;
	private Locale locale;
	private List cabecera;
	private int numeroLineas;
	private int numeroColumnas;
	private double[][] datos;

	public ConjuntoDatos(File archivoTexto, String separador, Locale locale) throws IOException {
		super();
		this.archivoTexto = archivoTexto;
		this.separador = new String(separador);
		this.locale = locale;
		this.numeroLineas = numLineas(archivoTexto);
		this.numeroColumnas = numColumnas(archivoTexto);
		this.cabecera = cabecera(archivoTexto);
		this.datos = leerDatos(archivoTexto, numeroLineas, numeroColumnas);
	}

	private List cabecera(File archivoTexto) throws IOException {
		FileReader fr = new FileReader(archivoTexto);
		BufferedReader br = new BufferedReader(fr);
		String str;
		str = br.readLine();
		ArrayList cabecera = new ArrayList();
		Scanner scanner = new Scanner(str);
		scanner.useDelimiter(separador);
		scanner.useLocale(locale);
		while (scanner.hasNext())
			cabecera.add(scanner.next());
		br.close();
		return cabecera;
	}

	private int numLineas(File archivoTexto) throws IOException {
		FileReader fr = new FileReader(archivoTexto);
		BufferedReader br = new BufferedReader(fr);
		int numLineas = 0;
		br.readLine();
		while (br.readLine() != null)
			numLineas++;
		br.close();
		return numLineas;
	}

	private int numColumnas(File archivoTexto) throws IOException {
		FileReader fr = new FileReader(archivoTexto);
		BufferedReader br = new BufferedReader(fr);
		String str;
		str = br.readLine();
		int numColumnas = 0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(str);
		scanner.useDelimiter(this.separador);
		scanner.useLocale(locale);
		while (scanner.hasNext()) {
			scanner.next();
			numColumnas++;
		}
		br.close();
		return numColumnas;
	}

	private double[][] leerDatos(File archivoTexto, int filas, int columnas) {
		double[][] matrizDatos = new double[filas][columnas];
		try {
			FileReader fr = new FileReader(archivoTexto);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			for (int i = 0; i < filas; i++) {
				String str;
				Scanner sc = new Scanner(br.readLine());
				sc.useDelimiter(this.separador);
				sc.useLocale(this.locale);
				int j = 0;
				while (sc.hasNext()) {
					matrizDatos[i][j] = sc.nextDouble();
					j++;
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return matrizDatos;
	}

	public double[] getColumna(int columna) {
		if (columna < 0 || columna > numeroColumnas)
			throw new RuntimeException("Columna no valida");
		double[] array = new double[numeroLineas];
		for (int i = 0; i < numeroLineas; i++)
			array[i] = datos[i][columna];
		return array;
	}

	public double[] getColumna(String columna) {
		Iterator iterador = cabecera.iterator();
		boolean encontrado = false;
		int i = 0;
		int indice = 0;
		while (iterador.hasNext()) {
			String str = (String) iterador.next();
			if (str.contentEquals(columna)) {
				indice = i;
				encontrado = true;
				break;
			}
			i++;
		}
		if (!encontrado)
			throw new RuntimeException("Columna no valida");
		return getColumna(indice);
	}

	public File getArchivoTexto() {
		return archivoTexto;
	}

	public String getSeparador() {
		return separador;
	}

	public Locale getLocale() {
		return locale;
	}

	public List getCabecera() {
		return cabecera;
	}

	public int getNumeroLineas() {
		return numeroLineas;
	}

	public int getNumeroColumnas() {
		return numeroColumnas;
	}

	public double[][] getDatos() {
		return datos;
	}

	public void exportar(String[] cabecera, String archivoTexto, String separador) throws IOException {
		double[][] tempDatos = new double[numeroLineas][cabecera.length];
		for (int i = 0; i < cabecera.length; i++) {
			double[] tempCol = getColumna(cabecera[i]);
			for (int j = 0; j < tempCol.length; j++) {
				tempDatos[j][i] = tempCol[j];
			}
		}
		PrintWriter pw = new PrintWriter(archivoTexto);
		for (int i = 0; i < cabecera.length; i++) {
			pw.print(cabecera[i]);
			if (i < cabecera.length - 1)
				pw.print(separador);
		}
		pw.println();
		for (int i = 0; i < tempDatos.length; i++) {
			for (int j = 0; j < tempDatos[0].length; j++) {
				pw.print(tempDatos[i][j]);
				if (j < tempDatos[0].length - 1)
					pw.print(separador);
			}
			pw.println();
		}
		pw.close();
	}

	public ConjuntoDatos conjuntoDatos(String[] cabecera, String archivoTexto, String separador, Locale locale)
			throws Exception {
		exportar(cabecera, archivoTexto, separador);
		return new ConjuntoDatos(new File(archivoTexto), separador, locale);
	}
}
