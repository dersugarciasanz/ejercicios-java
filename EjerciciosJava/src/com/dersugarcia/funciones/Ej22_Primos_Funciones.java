package com.dersugarcia.funciones;

import java.util.Vector;

public class Ej22_Primos_Funciones {
	public Vector<Integer> primosHasta(int num) {
		Vector<Integer> primos = new Vector<Integer>();

		for (int i = 1; i <= num; i++) {
			if (esPrimo(i)) {
				primos.add(i);
			}
		}

		return primos;
	}

	public boolean esPrimo(int num) {
		int resto = 1;
		int i = 2;
		while (i < num && resto != 0) {
			resto = num % i;
			i++;
		}
		return (resto != 0);

	}
}
