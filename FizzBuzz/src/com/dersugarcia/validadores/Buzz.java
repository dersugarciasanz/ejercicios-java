package com.dersugarcia.validadores;

public class Buzz extends Validador {
	
	public Buzz() {
		super("Buzz");
	}
	
	@Override
	public boolean validate(int num) {
		return (num % 5 == 0);
	}

}
