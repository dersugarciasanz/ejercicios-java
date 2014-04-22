package com.dersugarcia.arrays;

import java.util.Arrays;

public class Ej18_ConcatenarVectores {

	public static void main(String[] args) {

		int[] array1 = arrayNumerosAleatorios();
		int[] array2 = arrayNumerosAleatorios();
		int len3 = array1.length + array2.length;
		int[] array3 = new int[len3];

		
		for (int i=0; i<array1.length; i++) {
			array3[i] = array1[i];
			array3[array1.length + i] = array2[i];
		}
		
		
		System.out.println("Array1: " + Arrays.toString(array1));
		System.out.println("Array2: " + Arrays.toString(array2));
		System.out.println("Array3: " + Arrays.toString(array3));
	}

	public static int[] arrayNumerosAleatorios() {

		int array[] = new int[20];

		for (int i = 0; i < 20; i++) {
			array[i] = (int) (100 * Math.random() + 1);
		}
		// int array[] = {1,2,3,4,5,6,7,8,9,0,0,9,8,7,6,5,4,3,2,1};

		return array;
	}
}
