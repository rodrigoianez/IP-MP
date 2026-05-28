package org.mp.sesion07;

import java.util.ArrayList;

public class Imagen {

	private String formatoImagen;
	private String tipoImagen;
	private int lineas;
	private int columnas;
	private ArrayList<Banda<?>> bandas;

	/**Constructor imagen crea imagen
	 * @param lineas
	 * @param columnas
	 * @param formatoImagen
	 * @param tipoImagen
	 */
	public Imagen(int lineas, int columnas, String formatoImagen, String tipoImagen) {
		
		this.lineas = lineas;
		this.columnas = columnas;
		this.formatoImagen = formatoImagen;
		this.tipoImagen = tipoImagen;
		this.bandas = new ArrayList<Banda<?>>(); 

	}

	/**Metodo que nos permite obtener los datos que contiene una determinado elemento (x,y).
	 * @param x la x
	 * @param y la y
	 * @return devuelve un array con los datos obtenidos
	 * @throws XYFueraImagenException lanza una excepcion si el elemento x,y esta fuera de rango
	 */
	public Number[] getDatosPixel(int x, int y){
		
	Number[] datosPixel=new Number[bandas.size()];
	for(int i=0;i<bandas.size();i++) {
		datosPixel[i]=((bandas.get(i))).getDatoXY(x, y);
	}
	return datosPixel;
	}

	/**Metodo para obtener la imagen encerrada en los datoa indicados como parametro
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return devuelve un objeto de la clase Imagen obtenida 
	 * @throws XYFueraImagenException lanza una excepcion si el elemento x,y esta fuera de rango
	 */
	public Imagen extraerImagen(int x1, int y1, int x2, int y2) throws XYFueraImagenException{
		if(!XYValida(x1,y1,x2,y2))
			throw new XYFueraImagenException("debe saltar la excepción");
		else {
		
		int lin = y2-y1+1;   
		int col = x2-x1+1;
		Imagen imgC = new Imagen(lin, col, formatoImagen, tipoImagen);

		for(int i = 0; i < bandas.size(); i++){
			
			Number[][] datosC = new Number[lin][col];
			for(int k = x1 , f=0 ; k < (x2+1); k++ , f++) {
				for(int j = y1 , c =0 ; j < (y2+1); j++ , c++) {
					datosC[f][c] = getBanda(i).getDatoXY(k, j);
				}
			}	
			Banda<?> bandaIntegers = new Banda <>(getBanda(i).getNombreBanda(),datosC);
	        imgC.anadirBanda(bandaIntegers);
		}
		return imgC;
	}}

	/**Añade una banda a la lista
	 * @param banda
	 */
	public void anadirBanda(Banda<?> banda) {
		bandas.add(banda);
	}

	/**Elimina una banda de la lista
	 * @param i indice de la banda que e tiene que borrar
	 */
	public void eliminarBanda(int i) {
		bandas.remove(i);
	}

	/**metodo que hace un get
	 * @param i indice de la banda que queremos obtener
	 * @return devuelve la banda que se encuentra en la posicion i
	 */
	public Banda<?> getBanda(int i) {
		return (Banda<Number>)bandas.get(i);
	}

	/**metodo que hace un get
	 * @return devuelve la lista completa de bandas
	 */
	public ArrayList<Banda<?>> getBandas() {
		return bandas;
	}

	/**Metodo para obtener el tamaño de la lista
	 * @return devuelve el numero de bandas de la lista esto es el tamaño de la banda
	 */
	public int getNumeroBandas() {
		return bandas.size();
	}

	/**metodo que hace un get
	 * @return devuelve el numero de lineas o filas de la matriz de datos de la banda
	 */
	public int getLineas() {
		return lineas;
	}

	/**metodo que hace un get
	 * @return devuelve el numero de columnas de la matriz de datos de la banda
	 */
	public int getColumnas() {
		return columnas;
	}

	/**metodo que hace un get
	 * @return devuelve el tipo de imagen 
	 */
	public String getTipoImagen() {
		return tipoImagen;
	}
	/**
	*metodo que hace un set
	*/
	public void setTipoImagen(String tipoImagen) {
		this.tipoImagen = tipoImagen;
	}
	/**
	*metodo que hace un get
	*/
	public String getFormatoImagen() {
		return formatoImagen;
	}
	/**
	*metodo que hace un set
	*/
	public void setFormatoImagen(String formatoImagen) {
		this.formatoImagen = formatoImagen;
	}
	/**
	*metodo que hace un set
	*/
	public void setBandas(ArrayList<Banda<?>> bandas) {
		this.bandas = bandas;
	}

	/**Metodo que comprueba que las coordenadas si son correctas y estan dentro del rango
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return verdadero si las coordenadas son correctas
	 * @return falso si las coordenadas no son validas
	 * @throws XYFueraImagenException lanza una excepcion si las coordenadas no son correctas
	 */
	private boolean XYValida (int x1, int y1 , int x2 , int y2) throws XYFueraImagenException {
		if((x1 > lineas || x2 > lineas) || (y1 > columnas|| y2 > columnas))
			throw new XYFueraImagenException();

		return true;
	}
	/**
	*metodo to string 
	*@return un string con los datos de la imagen
	*/
	public String toString() {
		String imagenV ="Imagen: \n"+"Formato de Imagen :"+formatoImagen+"\n"+"Tipo de Imagen: "+tipoImagen+"\n"+"Numero de lineas:"+
		lineas+"\n"+"Numero de columnas:"+columnas+"\n";
		for (int i=0; i<bandas.size(); i++) {
		imagenV = imagenV + getBanda(i). toString();
		}
		return imagenV;

	}}
