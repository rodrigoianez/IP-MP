package org.mp.sesion07;


public class Banda<T extends Number> {
	
	private String  nombreBanda;
	private T[][] datos;
	/**
	 * Constructor Banda
	 *
	 * @param nombre el nombre de la banda
	 * @param x la x
	 * @param y la y
	 */
	public Banda(String nombre, int x, int y) {
		
		this.nombreBanda = nombre;
		this.datos = (T[][]) new Number[x][y];
		
	}
	
	/**
	 * Constructor banda
	 *
	 * @param nombre es el nombre
	 * @param datos son los datos
	 */
	public Banda(String nombre, T[][] datos) {
		this.nombreBanda = nombre;
		this.datos = datos;
	}
	
	
	/**
	 * metodo que obtiene el nombre
	 *
	 * @return el nombre de la banda
	 */
	public String getNombreBanda() {
		
		return nombreBanda;
		
	}
	
	/**
	 * metodo que asigna nombre a la banda
	 *
	 * @param nombreBanda el nuevo nombre de la banda
	 */
	public void setNombreBanda(String nombreBanda) {
		
		this.nombreBanda = nombreBanda;
		
	}
	
	public T[][] getDatos(){
		
		return datos;
		
	}
	
	/**
	 * metodo que asigna datos
	 *
	 * @param datos los nuevos datos
	 */
	public void setDatos(T[][] datos) {
		
		this.datos = datos;
		
	}
	
	/**
	 * metodo obtiene las coordenadas xy
	 *
	 * @param x es la x
	 * @param y es la y
	 * @return el dato que solicitamos
	 * @throws XYFueraImagenException el XY fuera imagen exception
	 */
	public T getDatoXY(int x, int y) {
		
		return datos[x][y];
		
	}
	
	/**
	 * metodo que hace un set de los datoa
	 *
	 * @param dato el dato
	 * @param x la x
	 * @param y la y
	 * @throws XYFueraImagenException el XY fuera imagen exception
	 */
	public void setDatoXY(T dato, int x, int y) {
		
		this.datos[x][y] = dato;
		
	}
	
	/**
	 * metodo to string
	 *
	 * @return el string
	 */
	public String toString() {
		
		String s = nombreBanda + ": \n";
		for(int i=0; i<datos.length; i++) {
			for(int j=0; j<datos[0].length; j++) {
				s += datos[i][j] + " ";
				
			}
			
			s += "\n";
			
		}
		
		return s;
		
	}

}
