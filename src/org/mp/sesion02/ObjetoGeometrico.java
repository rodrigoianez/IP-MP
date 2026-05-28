package org.mp.sesion02;

import java.util.*;

/**
 * Clase abstracta que determina lo que es un Objetogeometrico.
 * 
 * @author Rodrigo Iáñez Huertas.
 * @version 2022-12 (4.26.0)
 * 
 */
public abstract class ObjetoGeometrico {

	protected String color;
	protected boolean relleno;
	protected GregorianCalendar fechaCreado;

	/**
	 * Constructor vacío de ObjetoGeométrico que indica que el color del objeto es blanco.
	 * 
	 */
	
	protected ObjetoGeometrico() {
		super();
		this.color = "blanco";
	}

	/**
	 * Constructor genérico que crea un ObjetoGeométrico  ObjetoGEOMETRICO 
	 * 
	 * @param color			Color del objeto.
	 * @param relleno		Si el objeto es hueco o no.
	 */
	protected ObjetoGeometrico(String color, boolean relleno) {
		this.color = new String(color);
		this.relleno = relleno;
		this.fechaCreado = new GregorianCalendar();
	}

	/**
	 * Método que devuelve el color del ObjetoGeometrico.
	 * 
	 * @return color
	 */
	
	public String getColor() {
		return color;
	}

	/**
	 * Metodo que determina el valore de un objetoGeometrico.
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Método que devuelve si un ObjetoGeometrico está hueco o no.
	 * 
	 * @return relleno
	 */
	
	public boolean esRelleno() {
		return relleno;
	}

	/**
	 * Método que establece si un ObjetoGeometrico está relleno o ni.
	 * 
	 * @param relleno
	 */
	public void setRelleno(boolean relleno) {
		this.relleno = relleno;
	}

	/**
	 * Método que devuelve la fecha en la que fué creado el ObjetoGeometrico.
	 * 
	 * @return
	 */
	public GregorianCalendar getFechaCreado() {
		return fechaCreado;
	}
	
	/**
	 *Método que devuelve la salida por pantalla para cada ObjetoGemetrico creado.
	 *
	 */
	public String toString() {
		return "Creado el " + fechaCreado + "\ncolor: " + color + " y relleno: " + relleno;
	}
	
	/**
	 * Método abstracto que devuelve el valor del perimetro del ObjetoGeometrico.
	 * 
	 * @return
	 */
	public abstract double getPerimetro();

	/**
	 * Método abstracto que devuelve el valor del area del ObjetoGeometrico.
	 * 
	 * @return
	 */
	public abstract double getArea();

}
