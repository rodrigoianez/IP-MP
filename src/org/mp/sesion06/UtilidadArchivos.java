package org.mp.sesion06;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class UtilidadArchivos {
	private ArrayList lista;

	public UtilidadArchivos() {
		super();
		this.lista = new ArrayList();
	}

	public static void copiar(File origen, File destino) throws IOException {
		FileReader fr = new FileReader(origen);
		BufferedReader br = new BufferedReader(fr);
		PrintWriter pw = new PrintWriter(destino);
		String linea;
		while ((linea = br.readLine()) != null) {
			pw.println(linea);
		}
		br.close();
		pw.close();
	}

	public ArrayList listarDirectoriosArchivos(File dir) {
		lista.clear();
		listarDirectoriosArchivosRec(dir);
		return lista;
	}

	private void listarDirectoriosArchivosRec(File dir) {
		lista.add(dir.getAbsoluteFile());
		if (dir.isDirectory()) {
			String[] directorio = dir.list();
			for (int i = 0; i < directorio.length; i++)
				listarDirectoriosArchivosRec(new File(dir, directorio[i]));
		}
	}

	public void zip(File dir, String caminoSalida, String nombreArchivo) {
		listarDirectoriosArchivos(dir);
		byte[] buffer = new byte[1024];
		try {
			String archivoSalida = caminoSalida + "\\" + nombreArchivo + "\\";
			ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(archivoSalida));

			for (Iterator iter = lista.iterator(); iter.hasNext();) {
				File elemento = ((File) iter.next());
				if (elemento.isFile()) {
					FileInputStream fis = new FileInputStream(elemento.getAbsolutePath());

					zos.putNextEntry(new ZipEntry(elemento.getAbsolutePath()));

					int len;
					while ((len = fis.read(buffer)) > 0) {
						zos.write(buffer, 0, len);
					}
					zos.closeEntry();
					fis.close();
				}
			}
			zos.close();
			} catch (IOException e) {
		}
	}

	
}
