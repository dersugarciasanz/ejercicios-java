package com.dersugarcia.bucles;

public class Ej10_Fahrenheit {


	public static void main(String[] args) {
		double celsius;
		System.out.println("¼F\t¼C");
		System.out.println("================");
		
		for (int f=0; f<=300; f += 20) {
			celsius = (5.0/9.0)*(f - 32);
			System.out.println(f + "\t " + celsius );
		}
		
		
	}

}
