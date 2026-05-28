package org.mp.sesion05;
import java.util.Comparator;

public class NumeroPaloComparator implements Comparator<Carta>{

	public int compare(Carta carta1 , Carta carta2) {

		String[] palos = { "O", "C", "E", "B" }; 
		
		int valor = 0;

		if (carta1 == carta2)
			valor = 0;

		int palo1 = 0;
		int palo2 = 0;
		for (int i = 0 ; i < palos.length; i++) {
			if (palos[i].equals(carta1.getPalo()))
				palo1 = i;

			if (palos[i].equals(carta2.getPalo())) {
				palo2 = i;
			}
		}

		if (carta1.getNumero() > carta2.getNumero())
			valor = 1;
		else if (carta1.getNumero() < carta2.getNumero())
			valor = -1;
		else if(carta1.getNumero()==carta2.getNumero()) {
			if (palo1 >palo2)
				valor = 1;
			else if (palo1 <= palo2)
				valor = -1;
			else if (palo1==palo2)
				valor = 0;
		}
		return valor;

	}

}	
