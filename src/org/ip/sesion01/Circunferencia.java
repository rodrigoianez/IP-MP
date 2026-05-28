package org.ip.sesion01;

public class Circunferencia {
	public static void main(String[] args) {

		double radio = 4.57;
		double diametro = 2 * radio;
		double longitud = 2 * (Math.PI) * radio;
		double area = (Math.PI) * (radio * radio);

		System.out.println("Radio = " + radio + "\n" + "\nDiametro de la circunferencia = " + diametro
				+ "\nPerímetro de la circunferencia = " + longitud + "\nÁrea de la circunferencia = " + area);
	
	}
}
