package org.ip.sesion05;

import java.util.Scanner;

public class MatrizMagica {
	
	public static boolean esMatrizMagica(int[][] matriz) {
		
		int sum = 0;
		
		for (int i = 0; i < matriz[0].length; i++) {
			
			sum += matriz[0][i];
		}
		
		for (int i = 0; i < matriz.length; i++) {
			
			int sumColumna = 0;
			
			for (int j = 0; j < matriz.length; j++) {
				
				sumColumna += matriz[j][i];
				
			}
			
			if (sumColumna != sum) {
				
				return false;
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			
			int sumFila = 0;
			
			for (int j = 0; j < matriz.length; j++) {
				
				sumFila += matriz[i][j];
			}
			
			if (sumFila != sum) {
				
				return false;
				
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[4][4];

		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[0].length; j++) {
				
				System.out.print("M[" + i + "]" + "[" + j + "]: ");
				
				matriz[i][j] = sc.nextInt();
				
			}
		}

		if (esMatrizMagica(matriz)) {
			
			System.out.println("La matriz es magica");
			
		} else {
			
			System.out.println("La matriz no es magica");
			
		}
		
		sc.close();
	}
}
