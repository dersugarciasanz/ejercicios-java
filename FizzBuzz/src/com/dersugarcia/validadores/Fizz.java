package com.dersugarcia.validadores;
import com.dersugarcia.interfaces.*;

public class Fizz implements InterfazValidador {
	
	private static final String output = "Fizz";
	
	public boolean validate(int num) {
		return (num % 3 == 0);
	}
	
	public String getOutput() {
		return output;
	}
}