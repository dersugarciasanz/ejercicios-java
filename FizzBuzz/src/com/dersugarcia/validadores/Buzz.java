package com.dersugarcia.validadores;

public abstract class Buzz {
	
	private static final String output = "Buzz";
	
	public static boolean validate(int num) {
		return (num % 5 == 0);
	}
	public static String getOutput() {
		return output;
	}
}
