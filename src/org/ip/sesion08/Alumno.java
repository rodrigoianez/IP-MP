package org.ip.sesion08;

import java.util.Arrays;

public class Alumno implements Comparable<Object> {

	private String idPersonal;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private AsignaturaNota[] notasFinales;
	private int numAsignaturas;
	private double notaMediaFinal;

	public Alumno(String idPersonal, String nombre, String primerApellido, String segundoApellido,
			AsignaturaNota[] notasFinales) {
		this.idPersonal = idPersonal;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		if (notasFinales != null) {
			double suma = 0.0;
			this.notasFinales = new AsignaturaNota[notasFinales.length];
			for (int i = 0; i < this.notasFinales.length; i++) {
				String asignatura = notasFinales[i].getAsignatura();
				double nota = notasFinales[i].getNota();
				this.notasFinales[i] = new AsignaturaNota(asignatura, nota);
				suma += nota;
			}
			this.numAsignaturas = notasFinales.length;
			this.notaMediaFinal = suma / (double) notasFinales.length;
		} else {
			this.notasFinales = null;
			this.notaMediaFinal = 0.0;
			this.numAsignaturas = 0;
		}
	}

	public Alumno(String idPersonal, String nombre, String primerApellido, String segundoApellido) {
		this.idPersonal = idPersonal;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.notasFinales = null;
		this.numAsignaturas = 0;
		this.notaMediaFinal = 0.0;
	}

	public Alumno(Alumno alumno) {
		this.idPersonal = alumno.getIdPersonal();
		this.nombre = alumno.getNombre();
		this.primerApellido = alumno.getPrimerApellido();
		this.segundoApellido = alumno.getSegundoApellido();
		if (alumno.getNotasFinales() != null) {
			this.notasFinales = new AsignaturaNota[alumno.notasFinales.length];
			for (int i = 0; i < this.notasFinales.length; i++) {
				String asignatura = alumno.notasFinales[i].getAsignatura();
				double nota = alumno.notasFinales[i].getNota();
				this.notasFinales[i] = new AsignaturaNota(asignatura, nota);
			}
			this.numAsignaturas = alumno.getNumAsignaturas();
			this.notaMediaFinal = alumno.getNotaMediaFinal();
		}
	}

	public String getIdPersonal() {
		return idPersonal;
	}

	public void setIdPersonal(String idPersonal) {
		this.idPersonal = idPersonal;
	}

	private String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	private String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	private int getNumAsignaturas() {
		return numAsignaturas;
	}

	public AsignaturaNota[] getNotasFinales() {
		return notasFinales;
	}

	public double getNotaMediaFinal() {
		return notaMediaFinal;
	}

	public void setNotasFinales(AsignaturaNota[] notasFinales) {
		double suma = 0.0;
		this.notasFinales = new AsignaturaNota[notasFinales.length];
		for (int i = 0; i < this.notasFinales.length; i++) {
			String asignatura = notasFinales[i].getAsignatura();
			double nota = notasFinales[i].getNota();
			this.notasFinales[i] = new AsignaturaNota(asignatura, nota);
			suma += nota;
		}
		this.numAsignaturas = notasFinales.length;
		this.notaMediaFinal = suma / (double) notasFinales.length;
	}

	public boolean pasarDeCurso() {
		int numAsignaturasAprobadas = 0;
		for (int i = 0; i < numAsignaturas; i++) {
			if ((notasFinales[i].getNota()) >= 5.0) {
				numAsignaturasAprobadas++;
			}
			if (numAsignaturasAprobadas >= 3 && notaMediaFinal >= 5.0)
				return true;
		}
		return false;
	}

	public String obtenerListadoNotasAsignaturas() {
		String listado = "Asignaturas y Notas:" + " \n ";
		for (int i = 0; i < notasFinales.length; i++) {
			listado += " (" + notasFinales[i].getAsignatura() + "," + notasFinales[i].getNota() + ")";
			if (i != notasFinales.length - 1)
				listado += "\n";
		}
		return listado;
	}

	public int compareTo(Object o) {
		Alumno otro = (Alumno) o;
		if (this.getNotaMediaFinal() > otro.getNotaMediaFinal())
			return 1;
		if (this.getNotaMediaFinal() < otro.getNotaMediaFinal())
			return -1;
		return 0;
	}

	public String toString() {
		String finales = " [";
		for (int i = 0; i < notasFinales.length; i++) {
			finales = finales + "(" + notasFinales[i].getAsignatura() + "," + notasFinales[i].getNota() + ")";
			if (i != notasFinales.length - 1)
				finales = finales + "; ";
		}
		finales = finales + "]";
		String alumnoString = "Alumno:" + "\n" + "idPersonal:" + getIdPersonal() + "\n" + "Nombre: " + getNombre()
				+ "\n" + "Primer Apellido:" + getPrimerApellido() + "\n" + "Segundo Apellido:" + getSegundoApellido()
				+ "\n" + "Numero de asignaturas:" + getNumAsignaturas() + "\n" + "Nota Media Final: "
				+ getNotaMediaFinal() + "\n" + finales;
		return alumnoString;
	}

	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (!(o instanceof Alumno))
			return false;
		Alumno otro = (Alumno) o;
		if (!(this.idPersonal.equals(otro.getIdPersonal())
				&& Arrays.equals(this.notasFinales, (Object[]) otro.getNotasFinales())))
			return false;

		return true;

	}
}
