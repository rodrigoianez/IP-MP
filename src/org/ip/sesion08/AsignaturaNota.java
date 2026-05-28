package org.ip.sesion08;

public class AsignaturaNota implements Comparable<Object> {

	private String asignatura;
	private double nota;

	public AsignaturaNota() {
		this.asignatura = " ";
		this.nota = 0.0;
	}

	public AsignaturaNota(String asignatura, double nota) {
		this.asignatura = asignatura;
		this.nota = nota;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsigntura(String asignatura) {
		this.asignatura = asignatura;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public String toString() {
		return "(" + asignatura + ", " + nota + ")";
	}

	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (!(obj instanceof AsignaturaNota)) 
			return false;
		AsignaturaNota otro = (AsignaturaNota) obj;
		if (asignatura != otro.getAsignatura()) 
			return false;
		if (nota != otro.getNota()) 
			return false;
		return true;
	}

	public int compareTo(Object o) {
		AsignaturaNota otro = (AsignaturaNota) o;
		if (this.nota < otro.getNota()) 
			return -1;
		if (this.nota > otro.getNota()) 
			return 1;	 
			return 0;
	}



}
