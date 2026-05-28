package org.mp.sesion05;

public class Accion implements Comparable<Accion> {
	private String nombre;
	private long volumen;

	public Accion(String nombre, long volumen) {
		super();
		this.nombre = nombre;
		this.volumen = volumen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getVolumen() {
		return volumen;
	}

	public void setVolumen(long volumen) {
		this.volumen = volumen;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Accion other = (Accion) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (volumen != other.volumen)
			return false;
		return true;
	}

	
	public String toString() {
		return "Accion [nombre=" + nombre + ", volumen=" + volumen + "]";
	}

	@Override
	public int compareTo(Accion o) {
		return this.nombre.compareTo(o.getNombre());
	}
}