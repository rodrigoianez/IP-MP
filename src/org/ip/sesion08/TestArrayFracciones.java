package org.ip.sesion08;

import org.ip.sesion07.Fraccion;

public class TestArrayFracciones {

	private static ArrayFracciones arrayFracciones1;
	private static ArrayFracciones arrayFracciones2;
	private static ArrayFracciones arrayFracciones3;

	public static void cargaFraccionesArray() {
		Fraccion [] fracciones = {new Fraccion(8, 9), new Fraccion(11, -21), new Fraccion(1, 3),
				new Fraccion(1, 7), new Fraccion(7, 5), new Fraccion(11, 9), new Fraccion(-3, 13)};

		arrayFracciones1 = new ArrayFracciones(5);
		arrayFracciones2 = new ArrayFracciones(fracciones);
		arrayFracciones3 = new ArrayFracciones(arrayFracciones2);
		System.out.println("Finalizada la carga de los arrays de fracciones.");
		
	}

	public static void arrayFraccionesComprobarMetodos() {
		if (arrayFracciones2.getNumeroElementos() != 7)
			System.err.println("Error: El numero fracciones del array2 deberia ser 7 y es " + arrayFracciones2.getNumeroElementos());

		if (arrayFracciones3.getNumeroElementos() != 7)
			System.err.println("Error: El numero fracciones del array3 deberia ser 7 y es " + arrayFracciones3.getNumeroElementos());

		if (!arrayFracciones1.getValorElemento(2).equals(new Fraccion()))
			System.err.println("Error: El valor del elemento [2] del array1 deberia ser 0 y es " + arrayFracciones1.getValorElemento(2));


		arrayFracciones1.setArray(new Fraccion(1, 2));
		if (!arrayFracciones1.getValorElemento(2).equals(new Fraccion(1, 2)))
			System.err.println("Error: El valor del elemento [2] del array1 deberia ser 1/2 y es " + arrayFracciones1.getValorElemento(2));

		if (!arrayFracciones2.getValorElemento(3).equals(new Fraccion(1, 7))) 
			System.err.println("Error: El valor del elemento [3] del array2 deberia ser 1/7 y es " + arrayFracciones2.getValorElemento(3));

		arrayFracciones2.setValorElemento(3, new Fraccion(5, 7));
		if (!arrayFracciones2.getValorElemento(3).equals(new Fraccion(5, 7)))
			System.err.println("Error: El valor del elemento [3] del array2 deberia ser 5/7 y es " + arrayFracciones2.getValorElemento(3));
		
		
		if (!arrayFracciones3.getMinimo().equals(new Fraccion(11, -21)))
			System.err.println("Error: El valor del elemento minimo del array3 deberia ser 11/-21 y es " + arrayFracciones3.getMinimo());
		if (!arrayFracciones3.getMaximo().equals(new Fraccion(7, 5)))
			System.err.println("Error: El valor del elemento maximo del array3 deberia ser 7/5 y es " + arrayFracciones3.getMaximo());

		arrayFracciones3.setValorElemento(0, new Fraccion(11, 3));
		if (!arrayFracciones3.getMaximo().equals(new Fraccion(11, 3)))	
			System.err.println("Error: El valor del elemento maximo del array3 deberia ser 11/3 y es " + arrayFracciones3.getMaximo());
		if (!arrayFracciones1.getMinimo().equals(arrayFracciones1.getMaximo()))	
			System.err.println("Error: El valor de los elementos maximo y minimo del array1 deberian ser 1/2 y son " + arrayFracciones1.getMinimo() + " y " + arrayFracciones1.getMaximo());
		if (!arrayFracciones1.getSumaArray().equals(new Fraccion(5, 2)))
			System.err.println("Error: El valor suma del array1 deberia ser 5/2 y es " + arrayFracciones1.getSumaArray());
		if (!arrayFracciones2.getSumaArray().equals(new Fraccion(15578, 4095)))
			System.err.println("Error: El valor suma del array2 deberia ser 15578/4095 y es " + arrayFracciones2.getSumaArray());
		if (!arrayFracciones3.getSumaArray().equals(new Fraccion(24613, 4095)))
			System.err.println("Error: El valor suma del array3 deberia ser 24613/4095 y es " + arrayFracciones3.getSumaArray());
		System.out.println("Finalizada la comprobaciÃ³n de mÃ©todos de arrays de fracciones.");
	}
	
	public static void arrayFraccionesToStringArray() {
		
		arrayFracciones1.setArray(new Fraccion(1, 7));
		String salidaArray = arrayFracciones1.toString();
		String salidaEsperadaArray = "ArrayFracciones: [<1/7>, <1/7>, <1/7>, <1/7>, <1/7>]";
		if (!salidaArray.equals(salidaEsperadaArray))
			System.err.println("Error: arrayFracciones1.toString() no devuelve lo esperado:\n " + salidaEsperadaArray +"\n  sino:\n " + salidaArray); 

		salidaArray = arrayFracciones2.toString();
		salidaEsperadaArray = "ArrayFracciones: [<8/9>, <11/-21>, <1/3>, <5/7>, <7/5>, <11/9>, <-3/13>]";
		if (!salidaArray.equals(salidaEsperadaArray))
			System.err.println("Error: arrayFracciones2.toString() no devuelve lo esperado:\n " + salidaEsperadaArray +"\n  sino:\n " + salidaArray );
		
		arrayFracciones3.setValorElemento(0, new Fraccion(11, 3));
		arrayFracciones3.setValorElemento(4, new Fraccion(5, 13));
		salidaArray = arrayFracciones3.toString();
		salidaEsperadaArray = "ArrayFracciones: [<11/3>, <11/-21>, <1/3>, <1/7>, <5/13>, <11/9>, <-3/13>]";
		if (!salidaArray.equals(salidaEsperadaArray))
			System.err.println("Error: arrayFracciones3.toString() no devuelve lo esperado:\n " + salidaEsperadaArray +"\n  sino:\n " + salidaArray );

		System.out.println("Finalizada la comprobaciÃ³n de toString de arrays de fracciones.");
	}
	
	public static void arrayFraccionesEqualsCompareTo() {
		cargaFraccionesArray();
		ArrayFracciones arrayFracciones4 = new ArrayFracciones(7);
		for (int i = 0; i < arrayFracciones4.getNumeroElementos(); i++)
			arrayFracciones4.setValorElemento(i, new Fraccion(i, i + 1));
		if (!arrayFracciones4.getSumaArray().equals(new Fraccion(617, 140)))
			System.err.println("Error: El valor suma del array4 deberia ser 617/140 y es " + arrayFracciones4.getSumaArray());
		
		arrayFracciones4.setValorElemento(0, new Fraccion(-17, 3));
		if (!arrayFracciones4.getSumaArray().equals(new Fraccion(-529, 420)))
			System.err.println("Error: El valor suma del array4 deberia ser -529/420 y es " + arrayFracciones4.getSumaArray());

		if (arrayFracciones1.equals(arrayFracciones2))
			System.err.println("Error: array1 no deberÃ­a ser igual a array2");
		if (!arrayFracciones2.equals(arrayFracciones3))
			System.err.println("Error: array2 deberÃ­a ser igual a array3" + "\n array2: " + arrayFracciones2 + "\n array3: " + arrayFracciones3) ;
		if (arrayFracciones3.equals(arrayFracciones4))
			System.err.println("Error: array3 no deberÃ­a ser igual a array4");

		if (!(arrayFracciones1.compareTo(arrayFracciones2) == -1))
			System.err.println("Error: array1 deberÃ­a ser menor que array2");
		if (!(arrayFracciones2.compareTo(arrayFracciones1) == 1))
			System.err.println("Error: array2 deberÃ­a ser mayor que array1");
		if (!(arrayFracciones2.compareTo(arrayFracciones3) == 0))
			System.err.println("Error: array2 deberÃ­a ser igual que array3 (usando compareTo)"  + "\n array2: " + arrayFracciones2 + "\n array3: " + arrayFracciones3);
		if (!(arrayFracciones3.compareTo(arrayFracciones4) == 1))
			System.err.println("Error: array3 deberÃ­a ser mayor que array4");

		ArrayFracciones arrayFracciones5 = new ArrayFracciones(arrayFracciones4);
		if (!(arrayFracciones4.equals(arrayFracciones5)))
			System.err.println("Error: array4 y array5 deberÃ­an ser iguales (usando equals)"+ "\n array4: " + arrayFracciones4 + "\n array5: " + arrayFracciones5); 
				
		if (!(arrayFracciones4.compareTo(arrayFracciones5) == 0))
			System.err.println("Error: array4 y array5 deberÃ­an iguales (usando compareTo)"+ "\n array4: " + arrayFracciones4 + "\n array5: " + arrayFracciones5);

		System.out.println("Finalizada la comprobaciÃ³n de equals y compareTo de arrays de fracciones.");
	}


	public static void arrayFraccionesNuevoTest() {
		ArrayFracciones arrayFracciones4 = new ArrayFracciones(5);
		int potencia = 2;
		for (int i = 0; i < arrayFracciones4.getNumeroElementos(); i++) {
			Fraccion frac = arrayFracciones4.getValorElemento(i);
			frac.setNumerador(i + 1);
			frac.setDenominador(potencia);
			arrayFracciones4.setValorElemento(i, frac);
			potencia *= 2;
		}
		
		arrayFracciones1.setArray(new Fraccion(1, 2));

		if (arrayFracciones1.equals(arrayFracciones4)) {
			System.err.println("Error: array1 y array4 no deberÃ­an ser iguales (usando equals)"   + "\n array1: " + arrayFracciones1 + "\n array4: " + arrayFracciones4);
		}
		if (!(arrayFracciones1.compareTo(arrayFracciones4) == 1))
			System.err.println("Error: array1 deberÃ­a ser mayor que array4 (usando compareTo)");
		if (!(arrayFracciones1.getNumeroElementos() == arrayFracciones4.getNumeroElementos()))
			System.err.println("Error: el nÃºmero de elementos de array1 deberÃ­a ser igual que el de array4");
		if (!(arrayFracciones4.getSumaArray().equals(new Fraccion(57, 32))))
			System.err.println("Error: El valor suma del array4 deberia ser 57/32 y es " + arrayFracciones4.getSumaArray());
		if (!(arrayFracciones1.getSumaArray().equals(new Fraccion(5, 2))))
			System.err.println("Error: El valor suma del array1 deberia ser 5/2 y es " + arrayFracciones1.getSumaArray());
		if (!(arrayFracciones4.getMinimo().equals(new Fraccion(5, 32))))
			System.err.println("Error: El valor del elemento minimo del array4 deberia ser 5/32 y es " + arrayFracciones4.getMinimo());
		if (!(arrayFracciones4.getMaximo().equals(new Fraccion(1, 2))))
			System.err.println("Error: El valor del elemento maximo del array4 deberia ser 1/2 y es " + arrayFracciones4.getMaximo());
		
		System.out.println("Finalizada la comprobaciÃ³n de mÃ¡s mÃ©todos de arrays de fracciones.");
	}
	
	public static void main (String [] args) {
		cargaFraccionesArray();
		arrayFraccionesComprobarMetodos();
		arrayFraccionesToStringArray();
		arrayFraccionesEqualsCompareTo();
		arrayFraccionesNuevoTest();
	}
}