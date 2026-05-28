package org.mp.sesion02;

import java.util.*;

public class Empleado extends Persona{
	
	public int salario;
	public String despacho;
	public GregorianCalendar fechaContratacion;

	public Empleado(String nombre, String direccion, String telefono, String
			correoElectronico, int salario, String despacho, GregorianCalendar fechaContratacion) {
		
		super(nombre, direccion, telefono, correoElectronico);
		this.salario = salario;
		this.despacho = despacho;
		this.fechaContratacion = fechaContratacion;
	}
	
	public String toString() {
		
		return super.toString() + "\nDespacho = " + despacho + ", salario = " + salario + 
			   ", Fecha de contratación = " + fechaContratacion.get(Calendar.DATE) + "/" + 
			   (fechaContratacion.get(Calendar.MONTH) + 1 )+ "/" + fechaContratacion.get(Calendar.YEAR);
				
	}
}
