package com.dersugarcia.bucles;

import java.util.Scanner;

public class Ej09_Factorial {


	public static void main(String[] args) {
		
		int num, fact;
		
		
		System.out.println("Introduce el nœmero para obtener su factorial: ");
		Scanner entrada = new Scanner(System.in);
		num = entrada.nextInt();
		
		
		
		fact = 1;
		for(int i = 1; i<=num; i++) { 
			fact= fact*i; 
		} 
		System.out.println("Nœmero: " + num + "\nFactorial: " + fact);
		
		
	}

}
