package com.dersugarcia.arrays;

public class Ej17_Capicua {


	public static void main(String[] args) {

		int array[] = arrayNumerosAleatorios();
		
		if (esCapicua(array)) {
			System.out.println("Es capicua");
		} else {
			System.out.println("No es capicua");
		}
		
	}

	public static int[] arrayNumerosAleatorios() {
		
		int array[] = new int[20];
		
		for (int i=0; i<20; i++) {
			array[i] = (int) (100*Math.random()+1);
		}
//		int array[] = {1,2,3,4,5,6,7,8,9,0,0,9,8,7,6,5,4,3,2,1};
		
		return array;
	}
	
	public static boolean esCapicua(int array[]){
		
		boolean bool = true;
		int len = array.length;
		int i=0;
		while ( bool && i<len/2) {
			bool = (array[i]==array[len-i-1]);
			i++;
		}
		
		
		return bool;
	}
}
