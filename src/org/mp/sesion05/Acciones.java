package org.mp.sesion05;

import java.util.List;
import java.util.ArrayList;

public class Acciones {
	private List<Accion> acciones;

	public Acciones() {
		super();
		acciones = new ArrayList<Accion>();
	}

	public void add(Accion accion) {
		acciones.add(accion);
	}

	public List<Accion> getAcciones() {
		return acciones;
	}
}