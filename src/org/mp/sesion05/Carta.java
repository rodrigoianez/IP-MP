package org.mp.sesion05;

public class Carta extends NumeroPaloComparator implements Comparable<Carta> {

	private int valor;
	public String palo;
	public int numero;

	public Carta(String palo, int numero) {
		super();
		this.palo = palo;
		this.numero = numero;
		switch (palo) {
		case "O":
			this.valor = numero;
			break;
		case "C":
			this.valor = 12 + numero;
			break;
		case "E":
			this.valor = 24 + numero;
			break;
		case "B":
			this.valor = 36 + numero;
			break;
		}
		/*
		 * if(palo == "O") this.valor = numero; Hace lo mismo que el switch.
		 * 
		 * if(palo == "C") this.valor = numero+12;
		 * 
		 * if(palo == "E") this.valor = numero+24;
		 * 
		 * if(palo == "B") this.valor = numero+36;
		 * 
		 */
	}

	public int getValor() {
		return this.valor;
	}

	public String getPalo() {
		return this.palo;
	}

	int getNumero() {
		return this.numero;
	}

	public Carta(Carta carta) {
		this.palo = carta.getPalo();
		this.numero = carta.getNumero();
		this.valor = carta.getValor();
	}

	public int compareTo(Carta o) {
		Carta other=(Carta)o;
		int s=-2;
		if(this.palo.compareTo(other.palo)>0) {
			s=-1;
		}
		if(this.palo.compareTo(other.palo)<0) {
			s=1;
		}
		if(this.palo.compareTo(other.palo)==0) {
		if(this.numero<other.numero) {
			s=-1;
		}
		if(this.numero==other.numero) {
			s=0;
		}
		if(this.numero>other.numero) {
			s=1;
		}
		}
		if(s==-2) {
			s=super.compare(this, other);
		}
	return s;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		if (numero != other.numero || valor != other.valor || palo == "") {
			return false;
		} else {
			return true;
		}
	}

}