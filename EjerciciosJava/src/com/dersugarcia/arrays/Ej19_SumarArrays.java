package com.dersugarcia.arrays;

import java.util.Arrays;

public class Ej19_SumarArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] v1 = arrayNumerosAleatorios(10);
		int[] v2 = arrayNumerosAleatorios(15);
		int maxLen = Math.max(v1.length, v2.length);
		int[] v = new int[maxLen];
		
		int[] v11 = Arrays.copyOf(v1, maxLen);
		int[] v21 = Arrays.copyOf(v2, maxLen);
		
		for(int i = 0; i< maxLen; i++) {
			v[i] = v11[i] + v21[i];
		}
		System.out.println("Array1: " + Arrays.toString(v1));
		System.out.println("Array2: " + Arrays.toString(v2));
		System.out.println("Array3: " + Arrays.toString(v));

	}
	public static int[] arrayNumerosAleatorios(int length) {

		int array[] = new int[length];

		for (int i = 0; i < length; i++) {
			array[i] = (int) (100 * Math.random() + 1);
		}
		// int array[] = {1,2,3,4,5,6,7,8,9,0,0,9,8,7,6,5,4,3,2,1};

		return array;
	}
}
