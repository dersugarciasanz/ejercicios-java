package com.dersugarcia.arrays;

import java.util.Scanner;

public class Ej16_01 {


	public static void main(String[] args) {

		int max, min;
		int[] array = new int[5];
		Scanner entrada = new Scanner(System.in);
		
		for (int  i=0; i<5; i++) {
			System.out.println("Introduce un nœmero: ");
			array[i] = entrada.nextInt();
		}
		
		System.out.println("MAX: " + max(array) + "\nMIN: " + min(array));
		
		
	}
	
	public static int max(int[] array) {
		int max = array[0];
		
		for(int i=1; i<array.length; i++) {
			if (array[i]>max) {
				max = array[i];
			}
		}
		
		return max;
	}
	public static int min(int[] array) {
		int min = array[0];
		
		for(int i=1; i<array.length; i++) {
			if (array[i]<min) {
				min = array[i];
			}
		}
		
		return min;
	}

}
