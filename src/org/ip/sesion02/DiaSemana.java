package org.ip.sesion02;

public class DiaSemana {
	
	
	public static void main(String[] args) {

		int d=3;
		int m=3;
		int y=2006;
		
		System.out.print("El dia de la semana correspondiente al "+d+"/"+m+"/"+y+" es:");
		
		
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int	m0 = m + 12 * ((14 - m) / 12) - 2;
		int	d0 = (d + x + (31 * m0) / 12) % 7;
		
		
		if (d0==0) {
			System.out.println("\n\nDOMINGO");
			}
		else if (d0==1) {
			System.out.println("\n\nLUNES");
			}
		else if (d0==1) {
			System.out.println("\n\nMARTES");
			}
		else if (d0==3) {
			System.out.println("\n\nMIERCOLES");
			}	
		else if (d0==4) {
			System.out.println("\n\nJUEVES");
			}
		else if (d0==5) {
			System.out.println("\n\nVIERNES");
			}
		else if (d0==6) {
			System.out.println("\n\nSÁBADO");
			}	
		}
	
}


