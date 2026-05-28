package org.mp.sesion05;

import java.util.Comparator;

public class VolumenComparator implements Comparator<Accion> {

	@Override
	public int compare(Accion o1, Accion o2) {
		int s=-2;
		if(o1.getVolumen()<o2.getVolumen())
			s=-1;
		if(o1.getVolumen()==o2.getVolumen())
			s=0;
		if(o1.getVolumen()>o2.getVolumen())
			s=1;
		return s;
	}

}