package com.dersugarcia.validadores;

public class Mozz extends Validador  {
	
	public Mozz() {
		super("Mozz");
	}
	
	@Override
	public boolean validate(int num) {
		return (num % 7 == 0);
	}

}
