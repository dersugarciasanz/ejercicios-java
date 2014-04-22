package com.dersugarcia.bucles;

import java.util.Scanner;

public class Ej15_NumeroSecreto {

	public static int secreto  = (int) (100*Math.random()+1);
	
	
	public static void main(String[] args) {

		int numIntentos = 5;
		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un nœmero entre 1 y 100: ");
		numero = entrada.nextInt();
		numIntentos--;
		System.out.println("EL nœmero introducido es " + mensaje(numero) + " al nœmero secreto. Te quedan " + numIntentos + " intentos.");
		
		while (numIntentos > 0 && secreto!=numero) {
			System.out.println("Introduce un nœmero entre 1 y 100: ");
			numero = entrada.nextInt();
			numIntentos--;
			System.out.println("EL nœmero introducido es " + mensaje(numero) + " al nœmero secreto.");
		}
		
		if (secreto == numero) {
			System.out.println("Enhorabuena, has acertado el nœmero.");
		} else {
			System.out.println("L‡stima, prueba otra vez ma–ana.");
		}

	}
	
	public static String mensaje(int numero) {
		String mensaje;
		
		if(numero > secreto) {
			mensaje = "mayor";
		} else if (numero < secreto) { 
			mensaje = "menor";
		} else {
			mensaje = "igual";
		}
		
		return mensaje;
		
	}

}
