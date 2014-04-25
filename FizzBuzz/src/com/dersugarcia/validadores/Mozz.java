package com.dersugarcia.validadores;

import com.dersugarcia.excepciones.NumberNotValidException;

public class Mozz extends Validador  {
	
//	public Mozz() {
//		super("Mozz");
//	}
	
	@Override
	public boolean validate(int num) throws NumberNotValidException {
		validateException(num);
		return (num % 7 == 0);
	}

}
