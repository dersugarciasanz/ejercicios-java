package com.dersugarcia.validadores;
import com.dersugarcia.interfaces.*;

public class Mozz implements InterfazValidador {
	private static final String output = "Mozz";
	
	public boolean validate(int num) {
		return (num % 7 == 0);
	}
	
	public String getOutput() {
		return output;
	}
}
