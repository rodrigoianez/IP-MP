package org.ip.sesion04;

import java.util.*;

public class MaximoComunDivisor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce primer valor");

		int m = sc.nextInt();

		System.out.println("Introduce el segundo valor");

		int n = sc.nextInt();

		System.out.println("El máximo común divisor entre " + m + " y " + n + " es " + mcdRecursivo(m, n));

		sc.close();

	}

	public static int mcdRecursivo(int m, int n) {

		if (n == 0)
			return m;

		return mcdRecursivo(n, m % n);

	}

}
