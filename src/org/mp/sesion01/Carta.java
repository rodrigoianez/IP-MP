package org.mp.sesion01;

public class Carta {

	private int valor;
	public String palo;
	public int numero;
	
	public Carta(String palo, int numero) {		
		super();
		this.palo = palo;
		this.numero = numero;
		switch(palo){		
			case "O": this.valor = numero;
						break;					
			case "C": this.valor = 12 + numero;
						break;					
			case "E": this.valor = 24 + numero;
						break;					
			case "B": this.valor = 36 + numero;
						break;				
		}	
		/*
		 * if(palo == "O") this.valor = numero;		Hace lo mismo que el switch.
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
		this.palo =  	carta.getPalo();
		this.numero = 	carta.getNumero();
		this.valor = 	carta.getValor();
	}

	public int compareTo(Object obj) {	
		
		/*
		 *  int valor = 0; 
		 *  if(this == obj) 
		 *  valor = 0; 
		 *  if(this.equals(obj))
		 *  valor = 0; 
		 *  Carta1 carta = (Carta1) obj; 
		 *  char[] control = {'O','C','E','B'}; 
		 *  int posA = 0; 
		 *  for(int i = 0; i<control.length;i++) { 
		 * if(carta.getPalo().charAt(0) == control[i]) { 			Otra forma de hacer el Compareto (no está acabada)
		 * posA = i; 
		 * break; } 
		 * int posB = 0; 
		 * for(int j = 0; j<control.length; j++) { 
		 * if(carta.getPalo().charAt(0) == control[j]) {
		 * posB = j; 
		 * break; } } 
		 * if(posA < posB) { 
		 * valor=-1; } 
		 * if(posA > posB) { 
		 * valor=-1; } 
		 * if(posA == posB) {
		 * if(numero < get.(Carta)numero) { 
		 * valor=-1; } }
		 */			
		
		
		  Carta other = (Carta) obj; 
		  if (this.valor > other.getValor()) 
		  return 1; 
		  else if (this.valor < other.getValor()) 
		  return -1; 
		  else 
		  return 0; 
		 
	}
	
	
	public boolean equals(Object obj) {	
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;		
		Carta other = (Carta) obj;		
		if (numero != other.numero||valor != other.valor||palo == "") {
			return false;			
		}
		else {
			return true;
		}
	}
	
}



