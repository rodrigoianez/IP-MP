package org.mp.sesion02;

import java.util.GregorianCalendar;

public class Administrativo extends Empleado {

	public String destino;

	public Administrativo(String nombre, String direccion, String telefono, String correoElectronico, String despacho,
			int salario, GregorianCalendar fechaContratacion, String destino) {

		super(nombre, direccion, telefono, correoElectronico, salario, despacho, fechaContratacion);

		this.destino = destino;

	}
	
		public String toString() {
			
			return "Administrativo\n"+ super.toString() + "\nDestinado en la unidad " + this.destino;
					
		}
}
