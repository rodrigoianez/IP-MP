package org.mp.sesion02;

public class Persona {
	
	public String nombre;
	public String direccion;
	public String telefono;
	public String correoElectronico;
	
	public Persona(String nombre, String direccion, String telefono, String correoElectronico) {
		
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
		
	}
	
	public String toString() {
		
		return "Nombre = " + nombre + ", Dirección = " + direccion + 
			   ", Teléfono = " + telefono + ", email = " + correoElectronico;
		
	}
}
