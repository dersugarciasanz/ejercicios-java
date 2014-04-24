package com.dersugarcia.validadores;
import com.dersugarcia.interfaces.*;

public class Buzz implements InterfazValidador {
	
	private static final String output = "Buzz";
	
	public boolean validate(int num) {
		return (num % 5 == 0);
	}
	public String getOutput() {
		return output;
	}
}
