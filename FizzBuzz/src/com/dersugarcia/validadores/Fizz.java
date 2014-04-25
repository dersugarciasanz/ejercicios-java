package com.dersugarcia.validadores;

import com.dersugarcia.excepciones.NumberNotValidException;

public class Fizz extends Validador {

//	public Fizz() {
//		super("Fizz");
//	}
	
	@Override
	public boolean validate(int num) throws NumberNotValidException {
		validateException(num);
		return (num % 3 == 0);
	}

}
