package com.dersugarcia.fizzbuzz;

import java.util.ArrayList;

import com.dersugarcia.interfaces.InterfazValidador;
import com.dersugarcia.validadores.Buzz;
import com.dersugarcia.validadores.Fizz;
import com.dersugarcia.validadores.Mozz;

public class FizzBuzz {
	ArrayList<InterfazValidador> arrayI;
	
	public FizzBuzz() {
		arrayI = new ArrayList<InterfazValidador>();
		arrayI.add(new Fizz());
		arrayI.add(new Buzz());
		arrayI.add(new Mozz());
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

		for (int i=0; i<arrayI.size(); i++) {
			if (arrayI.get(i).validate(num)) {
				pal+= arrayI.get(i).getOutput();
			}
		}
		
		if(pal.length()==0) {
			pal=String.valueOf(num);
		}

		return pal;
	}
	
}
