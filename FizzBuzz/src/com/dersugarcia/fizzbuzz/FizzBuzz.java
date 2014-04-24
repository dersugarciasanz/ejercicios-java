package com.dersugarcia.fizzbuzz;

import com.dersugarcia.validadores.Buzz;
import com.dersugarcia.validadores.Fizz;

public class FizzBuzz {


	
	public String calcular(int num) {
		StringBuffer s = new StringBuffer();
		for(int i=1; i<=num; i++) {
			if(i!=1) {
				s.append(" ");
			}
			s.append(obtenerTexto(i));
		}
		return s.toString();
	}
	public String obtenerTexto(int num){
		String pal="";

		if (Fizz.validate(num)) {
			pal+= Fizz.getOutput();
		}
		
		if (Buzz.validate(num)) {
			pal+=Buzz.getOutput();
		}
		
		if(pal.length()==0) {
			pal=String.valueOf(num);
		}

		return pal;
	}
	
}
