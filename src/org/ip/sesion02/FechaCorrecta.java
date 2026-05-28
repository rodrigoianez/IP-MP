package org.ip.sesion02;

  public class FechaCorrecta {
	  	
	  	public static void main(String[] args) {

	  		
	  		int dia=28;
	  		int mes=2;
	  		int anio=2022;
	  		
	  		boolean anioBisiesto = anio%4==0&&anio%100!=0||anio%400==0;
	  		
	  		if(anio<1500 && anio>3000){
	  			System.out.print("Fecha incorrecta");}
	  		else  if (mes==1||mes==3||mes==5||mes==7||mes==7||mes==9||mes==10||mes==12&&dia<=31) {
	               System.out.print("Fecha correcta");
	               } 
	  		else if (mes==4||mes==6||mes==8||mes==7||mes==11&&dia<=30) {
	               System.out.print("Fecha correcta");
	               }     
	  		else if (mes==2 && dia<=28) {
	          	 System.out.print("Fecha correcta");
	          	 }
	  		else if (mes==2 && anioBisiesto==true && dia<=29) {
	      		 System.out.print("Fecha correcta");
	      	     }
	  	
	  	
	      else  {
	      				System.out.print("Fecha incorrecta"); 
	      				}
	  		System.out.print(": "+dia+"/"+mes+"/"+anio);
	    			}
	     
}
