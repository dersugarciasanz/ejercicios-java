package com.dersugarcia.fizzbuzz;

import java.util.ArrayList;

import com.dersugarcia.interfaces.InterfazValidador;
import com.dersugarcia.validadores.Buzz;
import com.dersugarcia.validadores.Fizz;
import com.dersugarcia.validadores.Mozz;

public class FizzBuzz {
	ArrayList<InterfazValidador> validadores;
	
	public FizzBuzz() {
		validadores = new ArrayList<InterfazValidador>();
		validadores.add(new Fizz());
		validadores.add(new Buzz());
		validadores.add(new Mozz());
	}
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

		for (InterfazValidador validador : validadores) {
			if (validador.validate(num)) {
				pal+= validador.getOutput();
			}
		}
		
		if(pal.length()==0) {
			pal=String.valueOf(num);
		}

		return pal;
	}
	
}
