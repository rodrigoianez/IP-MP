package org.mp.sesion02;

import java.util.GregorianCalendar;

public class Profesor extends Empleado{
	
	public int tipo;
	public String tipoA;
	public String horario;

	public Profesor(String nombre, String direccion, String telefono, String correoElectronico, String despacho,
			int salario, GregorianCalendar fechaContratacion, String horario, int tipo) {
		
		
		super(nombre, direccion, telefono, correoElectronico, salario, despacho, fechaContratacion);
		this.tipo = tipo;
		this.horario = horario;
		
	}

	public String toString() {
		
		if (tipo == 1) {		
			tipoA = "Ayudante\n";	
			
		}else if (tipo == 2 ) {	
			tipoA = "Titular de Universidad\n";
			
		}else if (tipo == 3) {	
			tipoA = "Catedrático de Universidad\n";
			
		}
		
		return "Profesor "+ tipoA + super.toString() + "\nHorario = " + horario;
		
	}
}


		
	


