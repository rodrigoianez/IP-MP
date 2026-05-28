package org.ip.sesion07;

public class Hora {

		protected int hora;
		protected int minuto;
		
		public Hora (int hora, int minuto) {
			
			this.hora = hora;
			this.minuto = minuto;
			
		}
		
		public void incrementar() {
			
			if (minuto > 59) {
				
				minuto=0;
				
				if(hora ==23) {
					
				hora = 0;
				
				} else {
					
				hora++;
				
				}
				
			} else {
					
				minuto++;
				
				}
		}
		
		public void setHora(int hora) {
			
			this.hora = hora;
			
		}
		
		public int getHora() {
			
			return hora;
		
		}
		
		public void setMinuto(int minuto) {
			
			this.minuto = minuto;
			
		}
		
		public int getMinuto() {
			
			return minuto;
		
		}
		
		public String toString() {
			
			return "Hora del reloj: " + String.format("%02d", hora) + ":" +  String.format("%02d", minuto);
				
		}		
}
