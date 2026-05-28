package org.mp.sesion05;

public class Baraja {
	
	private Carta[] cartas;
	private String nombreBaraja;

	public Baraja(String nombreBaraja, Carta[] cartas) {	
		super();
		this.nombreBaraja  = nombreBaraja;
		this.cartas = cartas;		
	}

	public Carta[] getCartas() {		
		return cartas;
	}
	
	public String getNombreBaraja() {
		return nombreBaraja;
	}
		
		public void insercion(Carta[] cartas) {
		for (int i = 1; i < cartas.length; i++) {			
			Carta aux = cartas[i];		
			int j;			
			for (j = i-1; j >= 0 && aux.compareTo(cartas[j]) == -1; j--) {			
				cartas[j + 1] = cartas[j];			
			}	
			cartas[j + 1] = aux;		
		}
	}

		

		
}


	

