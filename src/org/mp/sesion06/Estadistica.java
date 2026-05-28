package org.mp.sesion06;

import java.io.*;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class Estadistica {
	ConjuntoDatos cd;

	Estadistica(ConjuntoDatos cd) {
		super();
		this.cd = cd;
	}

	double media(String columna) throws Exception {
		double[] datos = cd.getColumna(columna);
		DescriptiveStatistics estadisticas = new DescriptiveStatistics(datos);
		return estadisticas.getMean();
	}

	double max(String columna) throws Exception {
		double[] datos = cd.getColumna(columna);
		DescriptiveStatistics estadisticas = new DescriptiveStatistics(datos);
		return estadisticas.getMax();
	}

	double min(String columna) throws Exception {
		double[] datos = cd.getColumna(columna);
		DescriptiveStatistics estadisticas = new DescriptiveStatistics(datos);
		return estadisticas.getMin();
	}

	double suma(String columna) throws Exception {
		double[] datos = cd.getColumna(columna);
		DescriptiveStatistics estadisticas = new DescriptiveStatistics(datos);
		return estadisticas.getSum();
	}
}
