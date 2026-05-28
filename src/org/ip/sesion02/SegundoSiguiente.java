package org.ip.sesion02;

public class SegundoSiguiente {
	
public static void main(String[] args) {
	
	int horas=3;
	int minutos=29;
	int segundos=36;
	
System.out.print("Instante de tiempo actual             : "+horas+":"+minutos+":"+segundos);

int segundos2 = segundos+1;
int minutos2 = minutos+1;
int horas2 = horas+1;

if(horas2 == 24 && minutos2 == 60 && segundos2 == 60 ) {
	System.out.println("\nInstante de tiempo un segundo después : 00:00:00");
}
	else if(horas2 == 24 && minutos2 == 60 && segundos2 != 60) {
		System.out.print("\nInstante de tiempo un segundo después : 00:00:"+ minutos2);	
	}
		else if(horas2 == 24 && minutos2 != 60 && segundos2 == 60) {
			System.out.print("\nInstante de tiempo un segundo después : 00:"+minutos2+":00");		
		}
			else if(horas2 == 24 && minutos2 != 60 && segundos2 != 60) {
					System.out.print("\nInstante de tiempo un segundo después : 00:"+minutos2+":"+segundos2);	
			}
				else if(horas2 != 24 && minutos2 == 60 && segundos2 == 60) {
						System.out.print("\nInstante de tiempo un segundo después : "+horas2+":00:00");	
				}	
					else if (horas2 != 24 && minutos2 == 60 && segundos2 != 60) {
							System.out.print("\nInstante de tiempo un sewgundo después  : "+horas2+":00:"+segundos2);
					} 
						else if(horas2 != 24 && minutos2 != 60 && segundos2 == 60){
								System.out.print("\nInstante de tiempo un segundo después : "+horas+":"+minutos2+":00");
						}
							else if (horas2 != 24 && minutos2 != 60 && segundos2 != 60) {
									System.out.print("\nInstante de tiempo un segundo después : "+horas+":"+minutos+":"+segundos2);
							}	
}

}

