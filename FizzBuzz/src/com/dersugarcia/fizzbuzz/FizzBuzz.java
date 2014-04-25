package com.dersugarcia.fizzbuzz;

import java.util.ArrayList;

import com.dersugarcia.excepciones.NumberNotValidException;
import com.dersugarcia.interfaces.InterfazValidador;

public class FizzBuzz {
	ArrayList<InterfazValidador> validadores;
	
	public FizzBuzz() {
		validadores = new ArrayList<InterfazValidador>();
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
			try {
				if (validador.validate(num)) {
					pal+= validador.getOutput();
				}
			} catch (NumberNotValidException e) {
				System.out.println(e.getMessage());
			}
		}
		
		if(pal.length()==0) {
			pal=String.valueOf(num);
		}

		return pal;
	}
	
	public void addValidador(InterfazValidador v) {
		if (!validadores.contains(v)) {
			validadores.add(v);
		}
	}
	
}
