package org.ip.sesion08;

import java.util.Arrays;

public class TestAsignaturasAlumnos {

	public static Alumno [] cargaAlumnosArray() {
		// ******************************************
		// InicializaciÃ³n de Alumnos y notas
		// ******************************************
		Alumno [] arrayAlumnos = new Alumno[5];

		Alumno alumno1 = new Alumno("12345678A", "Juan", "Lopez", "Lopez");
		AsignaturaNota [] asigaturaNota = new AsignaturaNota[5];
		asigaturaNota[0] = new AsignaturaNota("IP", 7.5);
		asigaturaNota[1] = new AsignaturaNota("Fis", 4.5);
		asigaturaNota[2] = new AsignaturaNota("OGE", 5.5);
		asigaturaNota[3] = new AsignaturaNota("ALMD", 6.0);
		asigaturaNota[4] = new AsignaturaNota("Cal", 6.5);
		alumno1.setNotasFinales(asigaturaNota);

		Alumno alumno2 = new Alumno("87654321Z", "Maria", "Garcia", "Sanchez");
		asigaturaNota[0].setNota(8.5);
		asigaturaNota[1].setNota(3.0);
		asigaturaNota[2].setNota(6.0);
		asigaturaNota[3].setNota(4.7);
		asigaturaNota[4].setNota(3.5);
		alumno2.setNotasFinales(asigaturaNota);

		asigaturaNota[0].setNota(9.5);
		asigaturaNota[1].setNota(7.0);
		asigaturaNota[2].setNota(6.0);
		asigaturaNota[3].setNota(8.3);
		asigaturaNota[4].setNota(5.5);
		Alumno alumno3 = new Alumno("33333333C", "Luis", "Perez", "Hernandez", asigaturaNota);

		Alumno alumno4 = new Alumno(alumno3);
		alumno4.setIdPersonal("44444444D");
		alumno4.setNombre("Isabel");
		asigaturaNota[0].setNota(9.0);
		asigaturaNota[1].setNota(6.5);
		asigaturaNota[2].setNota(7.5);
		asigaturaNota[3].setNota(6.8);
		asigaturaNota[4].setNota(7.3);
		alumno4.setNotasFinales(asigaturaNota);

		asigaturaNota[0].setNota(7.5);
		asigaturaNota[1].setNota(5.0);
		asigaturaNota[2].setNota(5.0);
		asigaturaNota[3].setNota(5.3);
		asigaturaNota[4].setNota(4.5);
		Arrays.sort(asigaturaNota);
		Alumno alumno5 = new Alumno("55555555C", "Alvaro", "Jimenez", "Ramos", asigaturaNota);

		arrayAlumnos[0] = alumno1;
		arrayAlumnos[1] = alumno2;
		arrayAlumnos[2] = alumno3;
		arrayAlumnos[3] = alumno4;
		arrayAlumnos[4] = alumno5;
		return arrayAlumnos;
	}

	
	public static void pruebasAlumnoPasarDeCurso(Alumno[] arrayAlumnos) {
		// ******************************************
		// Alumno: Pruebas del mÃ©todo pasarDeCurso()
		// ******************************************
		if (arrayAlumnos[0].pasarDeCurso())
			System.out.println("El alumno[0] con id " + arrayAlumnos[0].getIdPersonal() + " pasa de curso correctamente.");
		else
			System.err.println("ERROR en el mÃ©todo pasarDeCurso(): El alumno[0] con id " + arrayAlumnos[0].getIdPersonal() + " no pasa de curso y deberia hacerlo.");
		
		if (arrayAlumnos[1].pasarDeCurso())
			System.err.println("ERROR en el mÃ©todo pasarDeCurso(): El alumno[1] con id " + arrayAlumnos[1].getIdPersonal() + " pasa de curso y no deberia.");
		else
			System.out.println("El alumno[1] con id " + arrayAlumnos[1].getIdPersonal() + " no pasa de curso, es correcto.");
		
		int alumnosNoPasanCurso = 0;
		int alumnosPasanCurso = 0;
		for (int i = 0; i < arrayAlumnos.length; i++) {
			if (arrayAlumnos[i].pasarDeCurso())
				alumnosPasanCurso++;
			else
				alumnosNoPasanCurso++;
		}
		if (alumnosPasanCurso == 4)
			System.out.println("Pasan de curso correctamente " + alumnosPasanCurso + " estudiantes.");
		else
			System.err.println("ERROR: Deberian pasar de curso 4 alumnos y pasan " + alumnosPasanCurso);

		if (alumnosNoPasanCurso == 1)
			System.out.println("No pasan de curso " + alumnosNoPasanCurso + " estudiantes. Es correcto.");
		else 
			System.err.println("ERROR: Deberian no pasar de curso 1 alumno y no pasan " + alumnosNoPasanCurso);

	}
	
	public static void pruebasAlumnoEqualsCopia(Alumno[] arrayAlumnos) {
		// ******************************************
		// Alumno: Pruebas del mÃ©todo equals y constructor de copia
		// ******************************************
		if (arrayAlumnos[2].equals(arrayAlumnos[3]))
			System.err.println("ERROR: los alumnos de la posiciÃ³n 2 y 3 del array no son iguales. Revisa el mÃ©todo equals() de Alumno.");
		else
			System.out.println("Los alumnos de la posiciÃ³n 2 y 3 del array no son iguales.");

		Alumno alumnoTemp = new Alumno(arrayAlumnos[4]);
		if (arrayAlumnos[4].equals(alumnoTemp))
			System.out.println("El nuevo alumnoTemp es igual al alumno[4].");
		else
			System.err.println("ERROR: El nuevo alumnoTemp no es igual al alumno[4]. Revisa el constructor de copia de Alumno.");
	}
	
	public static void pruebasAlumnoCompareTo(Alumno[] arrayAlumnos) {
		// ******************************************
		// Alumno: Pruebas del mÃ©todo compareTo() 
		// ******************************************
		
		if (arrayAlumnos[2].compareTo(arrayAlumnos[3]) == -1)
			System.out.println("El alumno[2] es menor el alumno[3] porque su nota media final es menor.");
		else
			System.err.println("ERROR: El alumno[2] deberÃ­a ser menor el alumno[3] porque su nota media final es menor. Revisa el mÃ©todo compareTo() de Alumno.");

		if (arrayAlumnos[3].compareTo(arrayAlumnos[1]) == 1)
			System.out.println("El alumno[3] es mayor que el alumno[2] porque su nota media final es mayor.");
		else
			System.err.println("ERROR: El alumno[3] deberÃ­a ser mayor el alumno[2] porque su nota media final es mayor. Revisa el mÃ©todo compareTo() de Alumno.");
		
		Alumno alumnoTemp = new Alumno(arrayAlumnos[4]);
		if (alumnoTemp.compareTo(arrayAlumnos[4]) == 0) 
			System.out.println("El nuevo alumnoTemp es igual al alumno[4] porque sus notas medias son iguales.");
		else
			System.err.println("ERROR: El nuevo alumnoTemp deberÃ­a ser igual al alumno[4] porque sus notas medias son iguales. Revisa el metodo compareTo() de Alumno.");
	}
	
	public static void pruebasAsignaturaNotaEquals(Alumno[] arrayAlumnos) {
		// ******************************************
		// AsignaturaNota: Pruebas del mÃ©todo equals 
		// ******************************************
		if (arrayAlumnos[0].getNotasFinales()[0].equals(
			arrayAlumnos[4].getNotasFinales()[4]))
			System.out.println("La nota[0] de alumno[0] y nota[4] de alumno[4] son iguales: " + arrayAlumnos[0].getNotasFinales()[0].toString() + ".");
		else
			System.err.println("ERROR: La nota[0] de alumno[0] y nota[4] de alumno[4] son iguales, pero equals devuelve falso. Revisa el mÃ©todo equals de AsignaturaNota.");

		if (arrayAlumnos[1].getNotasFinales()[1].equals(
			arrayAlumnos[2].getNotasFinales()[1]))
			System.err.println("ERROR: La nota[1] de alumno[1] y la nota[1] de alumno[2] no son iguales, pero equals devuelve true. Revisa el mÃ©todo equals de AsignaturaNota.");
		else
			System.out.println("La nota[1] de alumno[1] y la nota[1] de alumno[2] no son iguales: " + 
					arrayAlumnos[1].getNotasFinales()[1] + ", " +arrayAlumnos[2].getNotasFinales()[1] + "."); 
	}
	
	public static void pruebasAsignaturaNotaCompareTo(Alumno[] arrayAlumnos) {
		// ******************************************
		// AsignaturaNota: Pruebas del mÃ©todo compareTo() 
		// ******************************************
		if (arrayAlumnos[0].getNotasFinales()[2].compareTo(
			arrayAlumnos[0].getNotasFinales()[4]) == -1) // menor que
			System.out.println("En alumno[0], la nota[2] " + arrayAlumnos[0].getNotasFinales()[2].toString() +
							   " es menor que la nota[4] " + arrayAlumnos[0].getNotasFinales()[4].toString() + ".");
		else
			System.err.println("ERROR: En alumno[0], la nota[2] " + arrayAlumnos[0].getNotasFinales()[2].toString() +
								 	  " es menor que la nota[4] " + arrayAlumnos[0].getNotasFinales()[4].toString() + 
									  " pero falla compareTo: revisalo!.");

		if (arrayAlumnos[0].getNotasFinales()[0].compareTo(
			arrayAlumnos[0].getNotasFinales()[1]) == 1) // mayor que
			System.out.println("En alumno[0], la nota[0] " + arrayAlumnos[0].getNotasFinales()[0].toString() +
							   " es mayor que la nota[1] " + arrayAlumnos[0].getNotasFinales()[1].toString() + ".");
		else
			System.err.println("ERROR: En alumno[0], la nota[0] es mayor que la nota[1] asi que falla compareTo: revisalo!.");
		

		if (arrayAlumnos[4].getNotasFinales()[1].compareTo(
			arrayAlumnos[4].getNotasFinales()[2]) == 0) // iguales
			System.out.println("En alumno[4], la nota[1] " + arrayAlumnos[4].getNotasFinales()[1].toString() +
							   " es igual que la nota[2] " + arrayAlumnos[4].getNotasFinales()[2].toString() + ".");
		else
			System.err.println("ERROR: En alumno[4], la nota[1] " + arrayAlumnos[4].getNotasFinales()[1].toString() +
									" es igual que la nota[2] " 	 + arrayAlumnos[4].getNotasFinales()[2].toString() + 
									" asi que falla compareTo: revisalo!.");
	}
	
	public static void pruebasAlumnoNotaMedia(Alumno[] arrayAlumnos) {
		// ******************************************
		// Alumno: Pruebas del mÃ©todo getNotaMediaFinal()
		// ******************************************
		double suma = 0.0;
		for (int i = 0; i < arrayAlumnos.length; i++) {
			suma += arrayAlumnos[i].getNotaMediaFinal();
		}
		double media = suma / (double) arrayAlumnos.length;
		if (media == 6.256)
			System.out.println("La nota media final del grupo se ha calculado correctamente y es " + media + ".");
		else
			System.err.println("ERROR: la nota media del grupo esperada deberia ser 6.256 y es" + media + ".");  
		
	}

	public static void main(String[] args) {
		Alumno [] arrayAlumnos;
		arrayAlumnos = cargaAlumnosArray();
		
		System.out.println("Listado detallado de Alumnos: ");
		System.out.println(Arrays.toString(arrayAlumnos));
		
		System.out.println("Listado de Asignaturas del alumno[0]: ");
		System.out.println(arrayAlumnos[0].obtenerListadoNotasAsignaturas());

		pruebasAlumnoPasarDeCurso(arrayAlumnos);
		pruebasAlumnoEqualsCopia(arrayAlumnos);
		pruebasAlumnoCompareTo(arrayAlumnos);
		pruebasAlumnoNotaMedia(arrayAlumnos);
		pruebasAsignaturaNotaEquals(arrayAlumnos);
		pruebasAsignaturaNotaCompareTo(arrayAlumnos);
		// pintarLineas(10);
		
		// Ordenar las notas de cada Alumno
		for (int i=0; i<arrayAlumnos.length; i++) {
			Arrays.sort(arrayAlumnos[i].getNotasFinales());
		}
		// Ordenar el listado de alumnos
		Arrays.sort(arrayAlumnos);
		System.out.println("Listado ORDENADO de Alumnos: ");
		System.out.println(Arrays.toString(arrayAlumnos));
		
	}
	
	public static void pintarLineas(int n) {
		for (int i =0 ; i<n ; i++) System.out.println();
	}
}