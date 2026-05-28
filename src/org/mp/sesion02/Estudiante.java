package org.mp.sesion02;

public class Estudiante extends Persona{
	
	public int numero;
	public String estudio;
	
	public Estudiante(String nombre, String direccion, String telefono, String correoElectronico, int numero) {
		
		super(nombre, direccion, telefono, correoElectronico);
		this.numero = numero;
		
		}
	
	public String toString() {
		
		if (numero == 1) {		
			estudio = "Grado";	
			
		}else if (numero == 2 ) {	
			estudio = "Máster";
			
		}else if (numero == 3) {	
			estudio = "Doctorado";
			
		}
		
		return "Estudiante de "+ estudio + "\n" + super.toString();
		
	}
}