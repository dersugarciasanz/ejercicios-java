package com.dersugarcia.validadores;

import com.dersugarcia.excepciones.NumberNotValidException;

public class Buzz extends Validador {
	
//	public Buzz() {
//		super("Buzz");
//	}
	
	@Override
	public boolean validate(int num) throws NumberNotValidException {
		validateException(num);
		return (num % 5 == 0);
	}

}
