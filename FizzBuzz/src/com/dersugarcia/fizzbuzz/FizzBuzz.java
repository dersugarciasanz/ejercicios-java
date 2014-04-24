package com.dersugarcia.fizzbuzz;

public class FizzBuzz {


	
	public String calcular(int num) {
		String s = "";
		for(int i=1; i<=num; i++) {
			if(i!=1) {
				s += " ";
			}
			s += obtenerTexto(i);
		}
		return s;
	}
	public String obtenerTexto(int num){
		String pal="";

		if (Fizz.eresFizz(num)) {
			pal+= Fizz.dameTexto();
		}
		if (Buzz.eresBuzz(num)) {
			pal+=Buzz.dameTexto();
		} else if(!Fizz.eresFizz(num)) {
				pal=String.valueOf(num);
		}

		return pal;
	}
	
}
