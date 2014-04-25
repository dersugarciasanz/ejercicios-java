package com.dersugarcia.factories;

import com.dersugarcia.validadores.Buzz;
import com.dersugarcia.validadores.Fizz;
import com.dersugarcia.validadores.Mozz;

public abstract class ValidatorFactory {

	public static final Fizz getFizzValidator() {
		Fizz f = new Fizz();
		f.setOutput("Fizz");
		return f;
	}
	
	public static final Buzz getBuzzValidator() {
		Buzz b = new Buzz();
		b.setOutput("Fizz");
		return b;
	}
	
	public static final Mozz getMozzValidator() {
		Mozz m = new Mozz();
		m.setOutput("Fizz");
		return m;
	}
	
}
