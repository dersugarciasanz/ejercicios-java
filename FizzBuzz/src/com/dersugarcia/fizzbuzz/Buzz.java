package com.dersugarcia.fizzbuzz;

public abstract class Buzz {
	public static boolean eresBuzz(int num) {
		return (num % 5 == 0);
	}
	public static String dameTexto() {
		return "Buzz";
	}
}
