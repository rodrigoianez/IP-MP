package org.mp.sesion07;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ImagenDAO {

	
	public static void escribirArchivo(String nombreArchivo, Imagen imagen) throws IOException {
		File cabecera = new File (nombreArchivo);
		PrintWriter pw = new PrintWriter (cabecera) ;
		String nombreArch;
		StringTokenizer tk = new StringTokenizer (cabecera.getName ()) ;
		nombreArch=tk.nextToken(".");
		pw.println(nombreArch+".dat");
		pw.println(imagen.getTipoImagen());
		pw.println(imagen.getFormatoImagen());
		pw.println(imagen.getNumeroBandas());
		pw.print("[");
		for (int i=0; i<imagen.getNumeroBandas ();i++) {
		if(i<imagen.getNumeroBandas()-1) {
		pw.print(imagen.getBanda(i).getNombreBanda()+";");
		}
		else 
		pw.println(imagen.getBanda(i).getNombreBanda()+"]");}
		
	pw.println(imagen.getLineas());
	pw.println(imagen.getColumnas());
	pw.close();
	String nombreBSQ=cabecera.getParent()+File.separator+nombreArch+".dat";
	escribirBSQ(nombreBSQ,imagen);
	}

	/**Metodo privado para escribir en un archivo el contenido binario de una imagen
	 * @param nombreArchivo
	 * @param imagen
	 * @throws IOException lanza una excepcion si no se encuentra el archivo
	 */
	private static void escribirBSQ(String nombreArchivo, Imagen imagen) throws IOException {

		File salidaBinaria = new File (nombreArchivo);
		FileOutputStream fis = new FileOutputStream(salidaBinaria);
		DataOutputStream dos = new DataOutputStream(fis);
		
	for(int i=0;i<imagen.getNumeroBandas();i++) {
		for(int j=0;j<imagen.getLineas();j++) {
			for(int k=0;k<imagen.getColumnas();k++) {
			if(imagen.getTipoImagen().equals("Integer"))
				dos.writeInt((int)imagen.getBanda(i).getDatoXY(j, k));
			if(imagen.getTipoImagen().equals("Double"))
				dos.writeDouble((double)imagen.getBanda(i).getDatoXY(j, k));
		}
	}}
	dos.close();
	}

	/**Metodo que permite leer un archivo de caracteres
	 * @param nombreArchivo nombre del archivo que queremos leer
	 * @return devuelve una imagen construida con la informacion leida del archivo
	 * @throws IOException lanza una excepcion si no se encuentra el archivo
	 */
	public static Imagen leerArchivo(String nombreArchivo) throws IOException {
		File file = new File(nombreArchivo);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String nombre = br.readLine();
		String tipoImagen = br.readLine();
		String formatoImagen = br.readLine();
		int numeroBandas = Integer.parseInt(br.readLine());
		String bandas = br.readLine();
		bandas = bandas.substring(1,bandas.length()-1);
		Scanner sn = new Scanner(bandas);
		sn.useDelimiter(";");
		String[] abandas = new String[numeroBandas];
			int i=0;
			while (sn.hasNext()) {
				abandas[i] = sn.next();
				i++;
			}
		int lineas = Integer.parseInt(br.readLine());
		int columnas = Integer.parseInt(br.readLine());
		br.close();
		String nombreArchivo1 = file.getParent() + File.separator + nombre;
		Imagen imagen = null;
		imagen = new Imagen(lineas, columnas, "BSQ", "Integer");
		imagen.setTipoImagen(tipoImagen);
		imagen = leerBSQ(nombreArchivo1, imagen, abandas, tipoImagen);

		return imagen;

	}

	/**Metodo para leer el contenido binario de un archivo
	 * @param nombreArchivo archivo que queremos leer
	 * @param imagen 
	 * @param nbandas array que contiene las bandas de la imagen
	 * @param tipoImagen
	 * @return devuelve una imagen con sus bandas leidas del archivo binario
	 * @throws IOException lanza una excepcion si no se encuentra el archivo
	 */
	private static Imagen leerBSQ(String nombreArchivo, Imagen imagen, String[] nbandas, String tipoImagen)
			throws IOException {

		FileInputStream fis = new FileInputStream(nombreArchivo);
		DataInputStream dis = new DataInputStream(fis);

		int lineas = imagen.getLineas();
		int columnas = imagen.getColumnas();
		int numeroBandas = nbandas.length;

		for (int i = 0; i < numeroBandas; i++) {
			Number[][] pixeles = new Number[lineas][columnas];
			for (int j = 0; j < lineas; j++) {
				for (int k = 0; k < columnas; k++) {
					if (tipoImagen.equals("Integer"))
						pixeles[k][j] = dis.readInt();
					if(tipoImagen.equals("Double"))
						pixeles[k][j] = dis.readDouble();

				}

			}

			Banda banda = new Banda(nbandas[i], pixeles);
			imagen.anadirBanda(banda);
		}
		fis.close();
		dis.close();
		return imagen;

	}

}
