package com.dersugarcia.fizzbuzz;

public abstract class Fizz {
	public static boolean eresFizz(int num) {
		return (num % 3 == 0);
	}
	
	public static String dameTexto() {
		return "Fizz";
	}
}
