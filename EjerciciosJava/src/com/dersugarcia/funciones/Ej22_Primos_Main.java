package com.dersugarcia.funciones;

import java.util.Scanner;
import java.util.Vector;

public class Ej22_Primos_Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.println("Introduce un nœmero positivo para saber si es primo o 0 para salir:");
		num=entrada.nextInt();
		while(num!=0) {
			System.out.println(num + " es primo? " + esPrimo(num));
			System.out.println("Numeros primos entre 1 y " + num + ": " + primosHasta(num).toString());
			System.out.println("\nIntroduce un nœmero positivo para saber si es primo o 0 para salir:");
			num=entrada.nextInt();
		}
		System.out.println("Hasta otra!");
	}

	public static Vector<Integer> primosHasta(int num) {
		Vector<Integer> primos = new Vector<Integer>();
		
		for(int i=1; i<=num; i++) {
			if (esPrimo(i)) {
				primos.add(i);
			}
		}
		
		return primos;
	}
	
	
	public static boolean esPrimo(int num) {
		int resto = 1;
		int i=2;
		while(i<num && resto!=0){
			resto = num % i;
			i++;
		}
		return (resto!=0);
		
	}
}
