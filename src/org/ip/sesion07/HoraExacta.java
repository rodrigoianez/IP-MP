package org.ip.sesion07;

public class HoraExacta extends Hora implements Comparable<Object> {
	
	protected int segundo;
	
	public HoraExacta (int hora, int minuto, int segundo) {
		
		super(hora, minuto);
		
		this.segundo = segundo;
		
	}
	
	public void setSegundo (int segundo) {
		
		if(segundo>=0 && segundo <=59)
			
			this.segundo=segundo;
		
	}
	
	public int getSegundo () {
		
		return segundo;
		
	}

	
	public void incrementar() {
		
		super.incrementar();
		
		segundo++;
		
		if(segundo>59) {
			
			segundo=0;
		
		}

	}
	
	public String toString() {
		
		return String.format("%02d", hora) +":"+ String.format("%02d", minuto) + ":" + String.format("%02d", segundo);
		
	}
	
	public boolean equals(Object o) {
		
		if (!(o instanceof HoraExacta)) {
			
		return false;
		
		}
		
		HoraExacta other = (HoraExacta) o;
		
		if (hora !=super.getHora()) {
			
		
		return false;
		
			} else if (minuto !=super.getMinuto()) {
			
				return false;
		
				} else if (segundo !=other.getSegundo()) {
			
					return false;
		
					} else { 
			
						return true;
		
						}	
		
	} 
	
	public int compareTo(Object o) {
		
		HoraExacta otro = (HoraExacta) o;
		
		
		if (otro.hora > this.hora)
			
		return -1;
		
			else if (otro.hora < this.hora)
				
				return 1;
				
		if (otro.minuto > this.minuto)
		
		return -1;
		
		 	else if (otro.minuto < this.minuto)
		
		 		return 1;
		
		 if (otro.segundo > this.segundo)
			
		return -1;
		
		 	else if (otro.segundo < this.segundo)
		 		
		 		return 1;
		 
		 else
					
		 return 0;
	
	}
	
}


