package com.dersugarcia.basicos;

import java.util.Scanner;

public class Ej4_01 {


	public static void main(String[] args) {
		int radio;
		float volumen, superficie;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el radio de la esfera: ");
		radio = entrada.nextInt();
		
		volumen = (float) ((4/3) * Math.PI * Math.pow(radio, 3));
		superficie = (float) (4 * Math.PI * Math.pow(radio, 2));
		
		System.out.println("Volumen: " + volumen);
		System.out.println("Superficie: " + superficie);
		


	}

}
