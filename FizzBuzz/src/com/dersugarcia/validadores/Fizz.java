package com.dersugarcia.validadores;

public class Fizz extends Validador {

	public Fizz() {
		super("Fizz");
	}
	
	@Override
	public boolean validate(int num) {
		return (num % 3 == 0);
	}

}
