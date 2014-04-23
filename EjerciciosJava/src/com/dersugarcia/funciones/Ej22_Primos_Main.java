package com.dersugarcia.funciones;

import java.util.Scanner;

public class Ej22_Primos_Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		Ej22_Primos_Funciones funciones = new Ej22_Primos_Funciones();
		
		System.out.println("Introduce un nœmero positivo para saber si es primo o 0 para salir:");
		num=entrada.nextInt();
		while(num!=0) {
			System.out.println(num + " es primo? " + funciones.esPrimo(num));
			System.out.println("Numeros primos entre 1 y " + num + ": " + funciones.primosHasta(num).toString());
			System.out.println("\nIntroduce un nœmero positivo para saber si es primo o 0 para salir:");
			num=entrada.nextInt();
		}
		System.out.println("Hasta otra!");
	}


}
