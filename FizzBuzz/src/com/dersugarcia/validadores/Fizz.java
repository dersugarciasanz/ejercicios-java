package com.dersugarcia.validadores;

public abstract class Fizz {
	
	private static final String output = "Fizz";
	
	public static boolean validate(int num) {
		return (num % 3 == 0);
	}
	
	public static String getOutput() {
		return output;
	}
}
