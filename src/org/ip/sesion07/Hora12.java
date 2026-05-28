package org.ip.sesion07;

public class Hora12 extends Hora{
	
	public enum Meridiano { AM, PM }
		
	protected Meridiano mer;
	
	public Hora12(int hora, int minuto, Meridiano mer) {
		
		super(hora, minuto);

		this.mer = mer;
		
	}
	
	public  void setHora(int hora) {
		
		this.hora = hora;
		
	}
	
	public void incrementar() {
		
		if (mer == Meridiano.AM) {
			
			setMinuto(getMinuto()+1);
			
			if(getMinuto()>59) {
				
			setMinuto(00);
			setHora(getHora()+1);
			
			}
			
			if(getHora()>12) {
				
			mer = Meridiano.PM;
			setHora(1);

		
			}
	
		}
	}
	
	public String toString() {
		
		return "Hora del reloj12: " + String.format("%02d", hora) +":"+ String.format("%02d", minuto)+ " "+mer;
		
	}
}